package com.example.material_tester.Ui.Activities.TextViewAction

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.*
import android.text.method.LinkMovementMethod
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.view.*
import android.view.ActionMode.Callback
import android.widget.PopupWindow
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.material_tester.R
import com.example.material_tester.Ui.Activities.bottomBar_nav.CommonAdapter
import com.example.material_tester.Ui.Activities.bottomBar_nav.item
import com.example.material_tester.Ui.Activities.bottomBar_nav.popupRecycleView

class TextActivity : AppCompatActivity(){
    private lateinit var textView:TextView;
    private lateinit var myText:String;
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)
        textView=findViewById(R.id.textViewActivity);
        myText= textView.text.toString();
        val start:Int=textView.selectionStart;
        val end:Int=textView.selectionEnd;
        textView.setOnTouchListener(object :View.OnTouchListener{
            override fun onTouch(view: View?, event: MotionEvent?): Boolean {
                if (view != null) {
                    handleTouch(event, textView);
                };
                return false;
            }
        })
        textView.viewTreeObserver.addOnPreDrawListener(object :ViewTreeObserver.OnPreDrawListener{
            override fun onPreDraw(): Boolean {
                textView.setTextIsSelectable(true);
                return true;
            }
        })

        setCallBack(textView);
        setSelectionChange(textView);
     }
//
//    private fun handleTouch(event: MotionEvent?, textView: TextView?) {
//         val action:Int = event?.getAction() ?: 0;
//
//        if (action == MotionEvent.ACTION_UP) {
//            // Lấy vị trí bắt đầu và kết thúc của việc chọn
//            val selectionStart = textView?.getSelectionStart();
//            val selectionEnd = textView?.getSelectionEnd();
//            // Kiểm tra xem có văn bản được chọn không
//            if (selectionStart != selectionEnd) {
//                // Xử lý sự kiện khi có văn bản được chọn
//               val selectedText: String = selectionStart?.let {
//                   if (selectionEnd != null) {
//                       textView.getText()
//                           ?.subSequence(it, selectionEnd).toString()
//                   }
//               }.toString();
//                // Làm điều gì đó với văn bản được chọn
//                Toast.makeText(this@TextActivity,selectionStart.toString()+" "+ selectionEnd.toString(),Toast.LENGTH_LONG).show();
//            }
//        }
//
//    }


//    private fun handleTouch(event: MotionEvent?, textView: TextView?) {
//        if (event != null) {
//            if (event.action == MotionEvent.ACTION_UP) {
//                val x = event.x.toInt()
//                val y = event.y.toInt()
//                val layout = textView?.layout
//                val startPosition= textView?.selectionStart;
//                val endPosition= textView?.selectionEnd;
//                val line = layout?.getLineForVertical(y)
//                val offset = line?.let { layout.getOffsetForHorizontal(it, x.toFloat()) }
//                if(textView!!.selectionStart!= textView.selectionEnd){
//                    val text=startPosition?.apply {
//                        endPosition?.let {
//                            myText.substring(this,it);
//                        }
//                    }
//                    try {
//                    if (text != null) {
//                        endPosition?.let { myText.substring(startPosition, it) }
//                            ?.let { Log.d("get it is:", it) }
//                    }else{
//                        Toast.makeText(this@TextActivity,"not get text to translate",Toast.LENGTH_LONG).show()
//                    }
//                    }catch (e:Exception){
//                       Log.d("error get",e.toString());
//                    }
//                }else{
//                if(offset!=null) {
//                    val (left, right) = findWordAtPosition(
//                        textView.text.toString(),
//                        offset
//                    )
//                  Log.d("get get article when click:",myText.substring(left,right));
//                }
//                }
//            }
//        }
//    }
        private fun handleTouch(event: MotionEvent?, textView: TextView?) {
        if (event != null) {
            if (event.action == MotionEvent.ACTION_DOWN) {
                val x = event.x.toInt()
                val y = event.y.toInt()
                val layout = textView?.layout
                val line = layout?.getLineForVertical(y)
                val offset = line?.let { layout.getOffsetForHorizontal(it, x.toFloat()) }
                val xOnScreen = offset?.let { layout.getPrimaryHorizontal(it).toInt() }
                val yOnScreen = line?.let { layout.getLineBottom(it).toInt() }
                if(offset!=null) {
                    val (left, right) = findWordAtPosition(
                        textView.text.toString(),
                        offset
                    )
                    if (xOnScreen != null&&yOnScreen!=null) {
                        setPopup(textView,xOnScreen,yOnScreen)
                    }
                  Log.d("get get article when click:",myText.substring(left,right));
                }
            }
        }
    }
   private fun findWordAtPosition(input: String, position: Int): Pair<Int,Int> {
    var start = position
    var end = position

    // Tìm vị trí bắt đầu của từ
    while (start > 0 && input[start - 1].isLetter()&&input[start].isLetter()) {
        start--
    }

    // Tìm vị trí kết thúc của từ
    while (end < input.length - 1 && input[end + 1].isLetter()&&input[end].isLetter()) {
        end++
    }

    // Trích xuất từ từ vị trí bắt đầu đến vị trí kết thúc
    return Pair(start, end+1);
   }
    private fun setCallBack(textView: TextView){
        textView.customSelectionActionModeCallback=object:Callback{
            override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean {
                if (menu != null) {
                    menu.removeItem(android.R.id.selectAll)
                    menu.removeItem(android.R.id.cut)
                    menu.removeItem(android.R.id.copy)
                    menu.removeItem(android.R.id.paste)
                    menu.removeItem(android.R.id.replaceText)
                    menu.removeItem(android.R.id.shareText)
                }
            return true;
            }

            override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean {
                return false;
            }

            override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {
                return false
            }

            override fun onDestroyActionMode(mode: ActionMode?) {

            }

        }
    }
    private fun setSelectionChange(textView: TextView){
        textView.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                val startSelection = textView.selectionStart
                val endSelection = textView.selectionEnd
                handleSelectionChange(startSelection, endSelection)
            }
        })
    }
    private fun  handleSelectionChange(startSelection:Int, endSelection:Int){
        Log.d("thay doi vi tri khi thay doi cursor","$startSelection $endSelection thay doi roi");
    }
    private fun listString():MutableList<item>{
        val list=MutableList<item>(0,{item("sfd")})
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        return list
    }
    private fun setPopup(view:View,x:Int,y:Int){
        val inflater:LayoutInflater =  this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater;
        val popupView=inflater.inflate(R.layout.popup_layout,null)
        val focusable=true
        val popupWindow= PopupWindow(popupView,1250,1250,focusable)
        popupWindow.elevation=10.0f
        popupWindow.isClippingEnabled=true
        val rcView=popupView.findViewById<RecyclerView>(R.id.popup_recycle)
        val _Adapter= popupRecycleView(listString(),this)
        _Adapter.setClickListener(object : CommonAdapter {
            override fun setOnClickListener(position: Int) {
                Toast.makeText(this@TextActivity,listString()[position].name,Toast.LENGTH_SHORT).show()
            }
        })
        rcView.let {
            it.layoutManager= LinearLayoutManager(this,
                RecyclerView.VERTICAL,false)
            it.adapter=_Adapter
        }
        popupWindow.showAtLocation(view,Gravity.AXIS_SPECIFIED,0,y-400)
    }
}
