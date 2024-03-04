package com.example.material_tester.Ui.Activities.CutomTextView

import android.animation.StateListAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.*
import android.graphics.drawable.Drawable
import android.os.*
import android.text.*
import android.text.method.KeyListener
import android.text.method.MovementMethod
import android.text.style.URLSpan
import android.util.LongSparseArray
import android.util.SparseArray
import android.view.*
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.view.accessibility.AccessibilityNodeProvider
import android.view.animation.Animation
import android.view.autofill.AutofillId
import android.view.autofill.AutofillValue
import android.view.contentcapture.ContentCaptureSession
import android.view.displayhash.DisplayHashResultCallback
import android.view.inputmethod.*
import android.view.textclassifier.TextClassifier
import android.view.translation.TranslationCapability
import android.view.translation.ViewTranslationCallback
import android.view.translation.ViewTranslationRequest
import android.view.translation.ViewTranslationResponse
import android.widget.Scroller
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.text.PrecomputedTextCompat
import java.util.*
import java.util.concurrent.Executor
import java.util.concurrent.Future
import java.util.function.Consumer

class MyTextView(context: Context): AppCompatTextView(context) {
    override fun setOnClickListener(l: OnClickListener?) {
        super.setOnClickListener(l)
    }

    override fun onSelectionChanged(selStart: Int, selEnd: Int) {
        super.onSelectionChanged(selStart, selEnd)
    }

    override fun invalidateDrawable(drawable: Drawable) {
        super.invalidateDrawable(drawable)
    }

    override fun scheduleDrawable(who: Drawable, what: Runnable, `when`: Long) {
        super.scheduleDrawable(who, what, `when`)
    }

    override fun unscheduleDrawable(who: Drawable, what: Runnable) {
        super.unscheduleDrawable(who, what)
    }

    override fun unscheduleDrawable(who: Drawable?) {
        super.unscheduleDrawable(who)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyLongPress(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyUp(keyCode, event)
    }

    override fun onKeyMultiple(keyCode: Int, repeatCount: Int, event: KeyEvent?): Boolean {
        return super.onKeyMultiple(keyCode, repeatCount, event)
    }

    override fun sendAccessibilityEvent(eventType: Int) {
        super.sendAccessibilityEvent(eventType)
    }

    override fun sendAccessibilityEventUnchecked(event: AccessibilityEvent?) {
        super.sendAccessibilityEventUnchecked(event)
    }

    override fun getAttributeResolutionStack(attribute: Int): IntArray {
        return super.getAttributeResolutionStack(attribute)
    }

    override fun getAttributeSourceResourceMap(): MutableMap<Int, Int> {
        return super.getAttributeSourceResourceMap()
    }

    override fun getExplicitStyle(): Int {
        return super.getExplicitStyle()
    }

    override fun getVerticalFadingEdgeLength(): Int {
        return super.getVerticalFadingEdgeLength()
    }

    override fun setFadingEdgeLength(length: Int) {
        super.setFadingEdgeLength(length)
    }

    override fun getHorizontalFadingEdgeLength(): Int {
        return super.getHorizontalFadingEdgeLength()
    }

    override fun getVerticalScrollbarWidth(): Int {
        return super.getVerticalScrollbarWidth()
    }

    override fun getHorizontalScrollbarHeight(): Int {
        return super.getHorizontalScrollbarHeight()
    }

    override fun setVerticalScrollbarThumbDrawable(drawable: Drawable?) {
        super.setVerticalScrollbarThumbDrawable(drawable)
    }

    override fun setVerticalScrollbarTrackDrawable(drawable: Drawable?) {
        super.setVerticalScrollbarTrackDrawable(drawable)
    }

    override fun setHorizontalScrollbarThumbDrawable(drawable: Drawable?) {
        super.setHorizontalScrollbarThumbDrawable(drawable)
    }

    override fun setHorizontalScrollbarTrackDrawable(drawable: Drawable?) {
        super.setHorizontalScrollbarTrackDrawable(drawable)
    }

    override fun getVerticalScrollbarThumbDrawable(): Drawable? {
        return super.getVerticalScrollbarThumbDrawable()
    }

    override fun getVerticalScrollbarTrackDrawable(): Drawable? {
        return super.getVerticalScrollbarTrackDrawable()
    }

    override fun getHorizontalScrollbarThumbDrawable(): Drawable? {
        return super.getHorizontalScrollbarThumbDrawable()
    }

    override fun getHorizontalScrollbarTrackDrawable(): Drawable? {
        return super.getHorizontalScrollbarTrackDrawable()
    }

    override fun setVerticalScrollbarPosition(position: Int) {
        super.setVerticalScrollbarPosition(position)
    }

    override fun getVerticalScrollbarPosition(): Int {
        return super.getVerticalScrollbarPosition()
    }

    override fun setScrollIndicators(indicators: Int) {
        super.setScrollIndicators(indicators)
    }

    override fun setScrollIndicators(indicators: Int, mask: Int) {
        super.setScrollIndicators(indicators, mask)
    }

    override fun getScrollIndicators(): Int {
        return super.getScrollIndicators()
    }

    override fun setOnScrollChangeListener(l: OnScrollChangeListener?) {
        super.setOnScrollChangeListener(l)
    }

    override fun setOnFocusChangeListener(l: OnFocusChangeListener?) {
        super.setOnFocusChangeListener(l)
    }

    override fun addOnLayoutChangeListener(listener: OnLayoutChangeListener?) {
        super.addOnLayoutChangeListener(listener)
    }

    override fun removeOnLayoutChangeListener(listener: OnLayoutChangeListener?) {
        super.removeOnLayoutChangeListener(listener)
    }

    override fun addOnAttachStateChangeListener(listener: OnAttachStateChangeListener?) {
        super.addOnAttachStateChangeListener(listener)
    }

    override fun removeOnAttachStateChangeListener(listener: OnAttachStateChangeListener?) {
        super.removeOnAttachStateChangeListener(listener)
    }

    override fun getOnFocusChangeListener(): OnFocusChangeListener {
        return super.getOnFocusChangeListener()
    }

    override fun hasOnClickListeners(): Boolean {
        return super.hasOnClickListeners()
    }

    override fun setOnLongClickListener(l: OnLongClickListener?) {
        super.setOnLongClickListener(l)
    }

    override fun hasOnLongClickListeners(): Boolean {
        return super.hasOnLongClickListeners()
    }

    override fun setOnContextClickListener(l: OnContextClickListener?) {
        super.setOnContextClickListener(l)
    }

    override fun setOnCreateContextMenuListener(l: OnCreateContextMenuListener?) {
        super.setOnCreateContextMenuListener(l)
    }

    override fun performClick(): Boolean {
        return super.performClick()
    }

    override fun callOnClick(): Boolean {
        return super.callOnClick()
    }

    override fun performLongClick(): Boolean {
        return super.performLongClick()
    }

    override fun performLongClick(x: Float, y: Float): Boolean {
        return super.performLongClick(x, y)
    }

    override fun performContextClick(x: Float, y: Float): Boolean {
        return super.performContextClick(x, y)
    }

    override fun performContextClick(): Boolean {
        return super.performContextClick()
    }

    override fun showContextMenu(): Boolean {
        return super.showContextMenu()
    }

    override fun showContextMenu(x: Float, y: Float): Boolean {
        return super.showContextMenu(x, y)
    }

    override fun startActionMode(callback: ActionMode.Callback?): ActionMode {
        return super.startActionMode(callback)
    }

    override fun startActionMode(callback: ActionMode.Callback?, type: Int): ActionMode {
        return super.startActionMode(callback, type)
    }

    override fun setOnKeyListener(l: OnKeyListener?) {
        super.setOnKeyListener(l)
    }

    override fun setOnTouchListener(l: OnTouchListener?) {
        super.setOnTouchListener(l)
    }

    override fun setOnGenericMotionListener(l: OnGenericMotionListener?) {
        super.setOnGenericMotionListener(l)
    }

    override fun setOnHoverListener(l: OnHoverListener?) {
        super.setOnHoverListener(l)
    }

    override fun setOnDragListener(l: OnDragListener?) {
        super.setOnDragListener(l)
    }

    override fun requestRectangleOnScreen(rectangle: Rect?): Boolean {
        return super.requestRectangleOnScreen(rectangle)
    }

    override fun requestRectangleOnScreen(rectangle: Rect?, immediate: Boolean): Boolean {
        return super.requestRectangleOnScreen(rectangle, immediate)
    }

    override fun clearFocus() {
        super.clearFocus()
    }

    override fun hasFocus(): Boolean {
        return super.hasFocus()
    }

    override fun hasFocusable(): Boolean {
        return super.hasFocusable()
    }

    override fun hasExplicitFocusable(): Boolean {
        return super.hasExplicitFocusable()
    }

    override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect)
    }

    override fun setAccessibilityPaneTitle(accessibilityPaneTitle: CharSequence?) {
        super.setAccessibilityPaneTitle(accessibilityPaneTitle)
    }

    override fun getAccessibilityPaneTitle(): CharSequence? {
        return super.getAccessibilityPaneTitle()
    }

    override fun announceForAccessibility(text: CharSequence?) {
        super.announceForAccessibility(text)
    }

    override fun dispatchPopulateAccessibilityEvent(event: AccessibilityEvent?): Boolean {
        return super.dispatchPopulateAccessibilityEvent(event)
    }

    override fun onPopulateAccessibilityEvent(event: AccessibilityEvent?) {
        super.onPopulateAccessibilityEvent(event)
    }

    override fun onInitializeAccessibilityEvent(event: AccessibilityEvent?) {
        super.onInitializeAccessibilityEvent(event)
    }

    override fun createAccessibilityNodeInfo(): AccessibilityNodeInfo {
        return super.createAccessibilityNodeInfo()
    }

    override fun onInitializeAccessibilityNodeInfo(info: AccessibilityNodeInfo?) {
        super.onInitializeAccessibilityNodeInfo(info)
    }

    override fun getAccessibilityClassName(): CharSequence {
        return super.getAccessibilityClassName()
    }

    override fun onProvideStructure(structure: ViewStructure?) {
        super.onProvideStructure(structure)
    }

    override fun onProvideAutofillStructure(structure: ViewStructure?, flags: Int) {
        super.onProvideAutofillStructure(structure, flags)
    }

    override fun onProvideContentCaptureStructure(structure: ViewStructure, flags: Int) {
        super.onProvideContentCaptureStructure(structure, flags)
    }

    override fun onProvideVirtualStructure(structure: ViewStructure?) {
        super.onProvideVirtualStructure(structure)
    }

    override fun onProvideAutofillVirtualStructure(structure: ViewStructure?, flags: Int) {
        super.onProvideAutofillVirtualStructure(structure, flags)
    }

    override fun setOnReceiveContentListener(
        mimeTypes: Array<out String>?,
        listener: OnReceiveContentListener?
    ) {
        super.setOnReceiveContentListener(mimeTypes, listener)
    }

    override fun performReceiveContent(payload: ContentInfo): ContentInfo? {
        return super.performReceiveContent(payload)
    }

    override fun onReceiveContent(payload: ContentInfo): ContentInfo? {
        return super.onReceiveContent(payload)
    }

    override fun getReceiveContentMimeTypes(): Array<String>? {
        return super.getReceiveContentMimeTypes()
    }

    override fun autofill(value: AutofillValue?) {
        super.autofill(value)
    }

    override fun autofill(values: SparseArray<AutofillValue>) {
        super.autofill(values)
    }

    override fun setAutofillId(id: AutofillId?) {
        super.setAutofillId(id)
    }

    override fun getAutofillType(): Int {
        return super.getAutofillType()
    }

    override fun getAutofillHints(): Array<String>? {
        return super.getAutofillHints()
    }

    override fun getAutofillValue(): AutofillValue? {
        return super.getAutofillValue()
    }

    override fun getImportantForAutofill(): Int {
        return super.getImportantForAutofill()
    }

    override fun setImportantForAutofill(mode: Int) {
        super.setImportantForAutofill(mode)
    }

    override fun getImportantForContentCapture(): Int {
        return super.getImportantForContentCapture()
    }

    override fun setImportantForContentCapture(mode: Int) {
        super.setImportantForContentCapture(mode)
    }

    override fun setContentCaptureSession(contentCaptureSession: ContentCaptureSession?) {
        super.setContentCaptureSession(contentCaptureSession)
    }

    override fun dispatchProvideStructure(structure: ViewStructure?) {
        super.dispatchProvideStructure(structure)
    }

    override fun dispatchProvideAutofillStructure(structure: ViewStructure, flags: Int) {
        super.dispatchProvideAutofillStructure(structure, flags)
    }

    override fun addExtraDataToAccessibilityNodeInfo(
        info: AccessibilityNodeInfo,
        extraDataKey: String,
        arguments: Bundle?
    ) {
        super.addExtraDataToAccessibilityNodeInfo(info, extraDataKey, arguments)
    }

    override fun isVisibleToUserForAutofill(virtualId: Int): Boolean {
        return super.isVisibleToUserForAutofill(virtualId)
    }

    override fun getAccessibilityDelegate(): AccessibilityDelegate {
        return super.getAccessibilityDelegate()
    }

    override fun setAccessibilityDelegate(delegate: AccessibilityDelegate?) {
        super.setAccessibilityDelegate(delegate)
    }

    override fun getAccessibilityNodeProvider(): AccessibilityNodeProvider {
        return super.getAccessibilityNodeProvider()
    }


    override fun setStateDescription(stateDescription: CharSequence?) {
        super.setStateDescription(stateDescription)
    }

    override fun setContentDescription(contentDescription: CharSequence?) {
        super.setContentDescription(contentDescription)
    }

    override fun setAccessibilityTraversalBefore(beforeId: Int) {
        super.setAccessibilityTraversalBefore(beforeId)
    }

    override fun getAccessibilityTraversalBefore(): Int {
        return super.getAccessibilityTraversalBefore()
    }

    override fun setAccessibilityTraversalAfter(afterId: Int) {
        super.setAccessibilityTraversalAfter(afterId)
    }

    override fun getAccessibilityTraversalAfter(): Int {
        return super.getAccessibilityTraversalAfter()
    }

    override fun getLabelFor(): Int {
        return super.getLabelFor()
    }

    override fun setLabelFor(id: Int) {
        super.setLabelFor(id)
    }

    override fun isFocused(): Boolean {
        return super.isFocused()
    }

    override fun findFocus(): View {
        return super.findFocus()
    }

    override fun isScrollContainer(): Boolean {
        return super.isScrollContainer()
    }

    override fun setScrollContainer(isScrollContainer: Boolean) {
        super.setScrollContainer(isScrollContainer)
    }

    override fun getDrawingCacheQuality(): Int {
        return super.getDrawingCacheQuality()
    }

    override fun setDrawingCacheQuality(quality: Int) {
        super.setDrawingCacheQuality(quality)
    }

    override fun getKeepScreenOn(): Boolean {
        return super.getKeepScreenOn()
    }

    override fun setKeepScreenOn(keepScreenOn: Boolean) {
        super.setKeepScreenOn(keepScreenOn)
    }

    override fun getNextFocusLeftId(): Int {
        return super.getNextFocusLeftId()
    }

    override fun setNextFocusLeftId(nextFocusLeftId: Int) {
        super.setNextFocusLeftId(nextFocusLeftId)
    }

    override fun getNextFocusRightId(): Int {
        return super.getNextFocusRightId()
    }

    override fun setNextFocusRightId(nextFocusRightId: Int) {
        super.setNextFocusRightId(nextFocusRightId)
    }

    override fun getNextFocusUpId(): Int {
        return super.getNextFocusUpId()
    }

    override fun setNextFocusUpId(nextFocusUpId: Int) {
        super.setNextFocusUpId(nextFocusUpId)
    }

    override fun getNextFocusDownId(): Int {
        return super.getNextFocusDownId()
    }

    override fun setNextFocusDownId(nextFocusDownId: Int) {
        super.setNextFocusDownId(nextFocusDownId)
    }

    override fun getNextFocusForwardId(): Int {
        return super.getNextFocusForwardId()
    }

    override fun setNextFocusForwardId(nextFocusForwardId: Int) {
        super.setNextFocusForwardId(nextFocusForwardId)
    }

    override fun getNextClusterForwardId(): Int {
        return super.getNextClusterForwardId()
    }

    override fun setNextClusterForwardId(nextClusterForwardId: Int) {
        super.setNextClusterForwardId(nextClusterForwardId)
    }

    override fun isShown(): Boolean {
        return super.isShown()
    }

    override fun fitSystemWindows(insets: Rect?): Boolean {
        return super.fitSystemWindows(insets)
    }

    override fun onApplyWindowInsets(insets: WindowInsets?): WindowInsets {
        return super.onApplyWindowInsets(insets)
    }

    override fun setOnApplyWindowInsetsListener(listener: OnApplyWindowInsetsListener?) {
        super.setOnApplyWindowInsetsListener(listener)
    }

    override fun dispatchApplyWindowInsets(insets: WindowInsets?): WindowInsets {
        return super.dispatchApplyWindowInsets(insets)
    }

    override fun setWindowInsetsAnimationCallback(callback: WindowInsetsAnimation.Callback?) {
        super.setWindowInsetsAnimationCallback(callback)
    }

    override fun dispatchWindowInsetsAnimationPrepare(animation: WindowInsetsAnimation) {
        super.dispatchWindowInsetsAnimationPrepare(animation)
    }

    override fun dispatchWindowInsetsAnimationStart(
        animation: WindowInsetsAnimation,
        bounds: WindowInsetsAnimation.Bounds
    ): WindowInsetsAnimation.Bounds {
        return super.dispatchWindowInsetsAnimationStart(animation, bounds)
    }

    override fun dispatchWindowInsetsAnimationProgress(
        insets: WindowInsets,
        runningAnimations: MutableList<WindowInsetsAnimation>
    ): WindowInsets {
        return super.dispatchWindowInsetsAnimationProgress(insets, runningAnimations)
    }

    override fun dispatchWindowInsetsAnimationEnd(animation: WindowInsetsAnimation) {
        super.dispatchWindowInsetsAnimationEnd(animation)
    }

    override fun setSystemGestureExclusionRects(rects: MutableList<Rect>) {
        super.setSystemGestureExclusionRects(rects)
    }

    override fun getSystemGestureExclusionRects(): MutableList<Rect> {
        return super.getSystemGestureExclusionRects()
    }

    override fun setHandwritingBoundsOffsets(
        offsetLeft: Float,
        offsetTop: Float,
        offsetRight: Float,
        offsetBottom: Float
    ) {
        super.setHandwritingBoundsOffsets(offsetLeft, offsetTop, offsetRight, offsetBottom)
    }

    override fun getHandwritingBoundsOffsetLeft(): Float {
        return super.getHandwritingBoundsOffsetLeft()
    }

    override fun getHandwritingBoundsOffsetTop(): Float {
        return super.getHandwritingBoundsOffsetTop()
    }

    override fun getHandwritingBoundsOffsetRight(): Float {
        return super.getHandwritingBoundsOffsetRight()
    }

    override fun getHandwritingBoundsOffsetBottom(): Float {
        return super.getHandwritingBoundsOffsetBottom()
    }

    override fun setHandwritingDelegatorCallback(callback: Runnable?) {
        super.setHandwritingDelegatorCallback(callback)
    }

    override fun getHandwritingDelegatorCallback(): Runnable? {
        return super.getHandwritingDelegatorCallback()
    }

    override fun setAllowedHandwritingDelegatePackage(allowedPackageName: String?) {
        super.setAllowedHandwritingDelegatePackage(allowedPackageName)
    }

    override fun getAllowedHandwritingDelegatePackageName(): String? {
        return super.getAllowedHandwritingDelegatePackageName()
    }

    override fun setIsHandwritingDelegate(isHandwritingDelegate: Boolean) {
        super.setIsHandwritingDelegate(isHandwritingDelegate)
    }

    override fun isHandwritingDelegate(): Boolean {
        return super.isHandwritingDelegate()
    }

    override fun setAllowedHandwritingDelegatorPackage(allowedPackageName: String?) {
        super.setAllowedHandwritingDelegatorPackage(allowedPackageName)
    }

    override fun getAllowedHandwritingDelegatorPackageName(): String? {
        return super.getAllowedHandwritingDelegatorPackageName()
    }

    override fun getLocationInSurface(location: IntArray) {
        super.getLocationInSurface(location)
    }

    override fun getRootWindowInsets(): WindowInsets {
        return super.getRootWindowInsets()
    }

    override fun getWindowInsetsController(): WindowInsetsController? {
        return super.getWindowInsetsController()
    }

    override fun computeSystemWindowInsets(
        `in`: WindowInsets?,
        outLocalInsets: Rect?
    ): WindowInsets {
        return super.computeSystemWindowInsets(`in`, outLocalInsets)
    }

    override fun setFitsSystemWindows(fitSystemWindows: Boolean) {
        super.setFitsSystemWindows(fitSystemWindows)
    }

    override fun getFitsSystemWindows(): Boolean {
        return super.getFitsSystemWindows()
    }

    override fun requestFitSystemWindows() {
        super.requestFitSystemWindows()
    }

    override fun requestApplyInsets() {
        super.requestApplyInsets()
    }

    override fun getVisibility(): Int {
        return super.getVisibility()
    }

    override fun setVisibility(visibility: Int) {
        super.setVisibility(visibility)
    }

    override fun isEnabled(): Boolean {
        return super.isEnabled()
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
    }

    override fun setFocusable(focusable: Boolean) {
        super.setFocusable(focusable)
    }

    override fun setFocusable(focusable: Int) {
        super.setFocusable(focusable)
    }

    override fun setFocusableInTouchMode(focusableInTouchMode: Boolean) {
        super.setFocusableInTouchMode(focusableInTouchMode)
    }

    override fun setAutofillHints(vararg autofillHints: String?) {
        super.setAutofillHints(*autofillHints)
    }

    override fun setSoundEffectsEnabled(soundEffectsEnabled: Boolean) {
        super.setSoundEffectsEnabled(soundEffectsEnabled)
    }

    override fun isSoundEffectsEnabled(): Boolean {
        return super.isSoundEffectsEnabled()
    }

    override fun setHapticFeedbackEnabled(hapticFeedbackEnabled: Boolean) {
        super.setHapticFeedbackEnabled(hapticFeedbackEnabled)
    }

    override fun isHapticFeedbackEnabled(): Boolean {
        return super.isHapticFeedbackEnabled()
    }

    override fun setLayoutDirection(layoutDirection: Int) {
        super.setLayoutDirection(layoutDirection)
    }

    override fun getLayoutDirection(): Int {
        return super.getLayoutDirection()
    }

    override fun hasTransientState(): Boolean {
        return super.hasTransientState()
    }

    override fun setHasTransientState(hasTransientState: Boolean) {
        super.setHasTransientState(hasTransientState)
    }

    override fun isAttachedToWindow(): Boolean {
        return super.isAttachedToWindow()
    }

    override fun isLaidOut(): Boolean {
        return super.isLaidOut()
    }

    override fun setWillNotDraw(willNotDraw: Boolean) {
        super.setWillNotDraw(willNotDraw)
    }

    override fun willNotDraw(): Boolean {
        return super.willNotDraw()
    }

    override fun setWillNotCacheDrawing(willNotCacheDrawing: Boolean) {
        super.setWillNotCacheDrawing(willNotCacheDrawing)
    }

    override fun willNotCacheDrawing(): Boolean {
        return super.willNotCacheDrawing()
    }

    override fun isClickable(): Boolean {
        return super.isClickable()
    }

    override fun setClickable(clickable: Boolean) {
        super.setClickable(clickable)
    }

    override fun setAllowClickWhenDisabled(clickableWhenDisabled: Boolean) {
        super.setAllowClickWhenDisabled(clickableWhenDisabled)
    }

    override fun isLongClickable(): Boolean {
        return super.isLongClickable()
    }

    override fun setLongClickable(longClickable: Boolean) {
        super.setLongClickable(longClickable)
    }

    override fun isContextClickable(): Boolean {
        return super.isContextClickable()
    }

    override fun setContextClickable(contextClickable: Boolean) {
        super.setContextClickable(contextClickable)
    }

    override fun setPressed(pressed: Boolean) {
        super.setPressed(pressed)
    }

    override fun dispatchSetPressed(pressed: Boolean) {
        super.dispatchSetPressed(pressed)
    }

    override fun isPressed(): Boolean {
        return super.isPressed()
    }

    override fun isSaveEnabled(): Boolean {
        return super.isSaveEnabled()
    }

    override fun setSaveEnabled(enabled: Boolean) {
        super.setSaveEnabled(enabled)
    }

    override fun getFilterTouchesWhenObscured(): Boolean {
        return super.getFilterTouchesWhenObscured()
    }

    override fun setFilterTouchesWhenObscured(enabled: Boolean) {
        super.setFilterTouchesWhenObscured(enabled)
    }

    override fun isSaveFromParentEnabled(): Boolean {
        return super.isSaveFromParentEnabled()
    }

    override fun setSaveFromParentEnabled(enabled: Boolean) {
        super.setSaveFromParentEnabled(enabled)
    }

    override fun getFocusable(): Int {
        return super.getFocusable()
    }

    override fun isScreenReaderFocusable(): Boolean {
        return super.isScreenReaderFocusable()
    }

    override fun setScreenReaderFocusable(screenReaderFocusable: Boolean) {
        super.setScreenReaderFocusable(screenReaderFocusable)
    }

    override fun isAccessibilityHeading(): Boolean {
        return super.isAccessibilityHeading()
    }

    override fun setAccessibilityHeading(isHeading: Boolean) {
        super.setAccessibilityHeading(isHeading)
    }

    override fun focusSearch(direction: Int): View {
        return super.focusSearch(direction)
    }

    override fun setKeyboardNavigationCluster(isCluster: Boolean) {
        super.setKeyboardNavigationCluster(isCluster)
    }

    override fun setFocusedByDefault(isFocusedByDefault: Boolean) {
        super.setFocusedByDefault(isFocusedByDefault)
    }

    override fun keyboardNavigationClusterSearch(currentCluster: View?, direction: Int): View {
        return super.keyboardNavigationClusterSearch(currentCluster, direction)
    }

    override fun dispatchUnhandledMove(focused: View?, direction: Int): Boolean {
        return super.dispatchUnhandledMove(focused, direction)
    }

    override fun setDefaultFocusHighlightEnabled(defaultFocusHighlightEnabled: Boolean) {
        super.setDefaultFocusHighlightEnabled(defaultFocusHighlightEnabled)
    }

    override fun getFocusables(direction: Int): ArrayList<View> {
        return super.getFocusables(direction)
    }

    override fun addFocusables(views: ArrayList<View>?, direction: Int) {
        super.addFocusables(views, direction)
    }

    override fun addFocusables(views: ArrayList<View>?, direction: Int, focusableMode: Int) {
        super.addFocusables(views, direction, focusableMode)
    }

    override fun addKeyboardNavigationClusters(views: MutableCollection<View>, direction: Int) {
        super.addKeyboardNavigationClusters(views, direction)
    }

    override fun findViewsWithText(
        outViews: ArrayList<View>?,
        searched: CharSequence?,
        flags: Int
    ) {
        super.findViewsWithText(outViews, searched, flags)
    }

    override fun getTouchables(): ArrayList<View> {
        return super.getTouchables()
    }

    override fun addTouchables(views: ArrayList<View>?) {
        super.addTouchables(views)
    }

    override fun isAccessibilityFocused(): Boolean {
        return super.isAccessibilityFocused()
    }

    override fun requestFocus(direction: Int, previouslyFocusedRect: Rect?): Boolean {
        return super.requestFocus(direction, previouslyFocusedRect)
    }

    override fun restoreDefaultFocus(): Boolean {
        return super.restoreDefaultFocus()
    }

    override fun getImportantForAccessibility(): Int {
        return super.getImportantForAccessibility()
    }

    override fun setAccessibilityLiveRegion(mode: Int) {
        super.setAccessibilityLiveRegion(mode)
    }

    override fun getAccessibilityLiveRegion(): Int {
        return super.getAccessibilityLiveRegion()
    }

    override fun setImportantForAccessibility(mode: Int) {
        super.setImportantForAccessibility(mode)
    }

    override fun isImportantForAccessibility(): Boolean {
        return super.isImportantForAccessibility()
    }

    override fun getParentForAccessibility(): ViewParent {
        return super.getParentForAccessibility()
    }

    override fun addChildrenForAccessibility(outChildren: ArrayList<View>?) {
        super.addChildrenForAccessibility(outChildren)
    }

    override fun isAccessibilityDataSensitive(): Boolean {
        return super.isAccessibilityDataSensitive()
    }

    override fun setAccessibilityDataSensitive(accessibilityDataSensitive: Int) {
        super.setAccessibilityDataSensitive(accessibilityDataSensitive)
    }

    override fun setTransitionVisibility(visibility: Int) {
        super.setTransitionVisibility(visibility)
    }

    override fun dispatchNestedPrePerformAccessibilityAction(
        action: Int,
        arguments: Bundle?
    ): Boolean {
        return super.dispatchNestedPrePerformAccessibilityAction(action, arguments)
    }

    override fun performAccessibilityAction(action: Int, arguments: Bundle?): Boolean {
        return super.performAccessibilityAction(action, arguments)
    }

    override fun dispatchStartTemporaryDetach() {
        super.dispatchStartTemporaryDetach()
    }

    override fun onStartTemporaryDetach() {
        super.onStartTemporaryDetach()
    }

    override fun dispatchFinishTemporaryDetach() {
        super.dispatchFinishTemporaryDetach()
    }

    override fun onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach()
    }

    override fun getKeyDispatcherState(): KeyEvent.DispatcherState {
        return super.getKeyDispatcherState()
    }

    override fun dispatchKeyEventPreIme(event: KeyEvent?): Boolean {
        return super.dispatchKeyEventPreIme(event)
    }

    override fun dispatchKeyEvent(event: KeyEvent?): Boolean {
        return super.dispatchKeyEvent(event)
    }

    override fun dispatchKeyShortcutEvent(event: KeyEvent?): Boolean {
        return super.dispatchKeyShortcutEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        return super.dispatchTouchEvent(event)
    }

    override fun onFilterTouchEventForSecurity(event: MotionEvent?): Boolean {
        return super.onFilterTouchEventForSecurity(event)
    }

    override fun dispatchTrackballEvent(event: MotionEvent?): Boolean {
        return super.dispatchTrackballEvent(event)
    }

    override fun dispatchCapturedPointerEvent(event: MotionEvent?): Boolean {
        return super.dispatchCapturedPointerEvent(event)
    }

    override fun dispatchGenericMotionEvent(event: MotionEvent?): Boolean {
        return super.dispatchGenericMotionEvent(event)
    }

    override fun dispatchHoverEvent(event: MotionEvent?): Boolean {
        return super.dispatchHoverEvent(event)
    }

    override fun dispatchGenericPointerEvent(event: MotionEvent?): Boolean {
        return super.dispatchGenericPointerEvent(event)
    }

    override fun dispatchGenericFocusedEvent(event: MotionEvent?): Boolean {
        return super.dispatchGenericFocusedEvent(event)
    }

    override fun dispatchWindowFocusChanged(hasFocus: Boolean) {
        super.dispatchWindowFocusChanged(hasFocus)
    }

    override fun onWindowFocusChanged(hasWindowFocus: Boolean) {
        super.onWindowFocusChanged(hasWindowFocus)
    }

    override fun hasWindowFocus(): Boolean {
        return super.hasWindowFocus()
    }

    override fun dispatchVisibilityChanged(changedView: View, visibility: Int) {
        super.dispatchVisibilityChanged(changedView, visibility)
    }

    override fun onVisibilityChanged(changedView: View, visibility: Int) {
        super.onVisibilityChanged(changedView, visibility)
    }

    override fun dispatchDisplayHint(hint: Int) {
        super.dispatchDisplayHint(hint)
    }

    override fun onDisplayHint(hint: Int) {
        super.onDisplayHint(hint)
    }

    override fun dispatchWindowVisibilityChanged(visibility: Int) {
        super.dispatchWindowVisibilityChanged(visibility)
    }

    override fun onWindowVisibilityChanged(visibility: Int) {
        super.onWindowVisibilityChanged(visibility)
    }

    override fun onVisibilityAggregated(isVisible: Boolean) {
        super.onVisibilityAggregated(isVisible)
    }

    override fun getWindowVisibility(): Int {
        return super.getWindowVisibility()
    }

    override fun getWindowVisibleDisplayFrame(outRect: Rect?) {
        super.getWindowVisibleDisplayFrame(outRect)
    }

    override fun dispatchConfigurationChanged(newConfig: Configuration?) {
        super.dispatchConfigurationChanged(newConfig)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
    }

    override fun isInTouchMode(): Boolean {
        return super.isInTouchMode()
    }

    override fun onKeyPreIme(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyPreIme(keyCode, event)
    }

    override fun onKeyShortcut(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyShortcut(keyCode, event)
    }

    override fun onCheckIsTextEditor(): Boolean {
        return super.onCheckIsTextEditor()
    }

    override fun onCreateInputConnection(outAttrs: EditorInfo?): InputConnection {
        return super.onCreateInputConnection(outAttrs)
    }

    override fun checkInputConnectionProxy(view: View?): Boolean {
        return super.checkInputConnectionProxy(view)
    }

    override fun createContextMenu(menu: ContextMenu?) {
        super.createContextMenu(menu)
    }

    override fun getContextMenuInfo(): ContextMenu.ContextMenuInfo {
        return super.getContextMenuInfo()
    }

    override fun onCreateContextMenu(menu: ContextMenu?) {
        super.onCreateContextMenu(menu)
    }

    override fun onTrackballEvent(event: MotionEvent?): Boolean {
        return super.onTrackballEvent(event)
    }

    override fun onGenericMotionEvent(event: MotionEvent?): Boolean {
        return super.onGenericMotionEvent(event)
    }

    override fun onHoverEvent(event: MotionEvent?): Boolean {
        return super.onHoverEvent(event)
    }

    override fun isHovered(): Boolean {
        return super.isHovered()
    }

    override fun setHovered(hovered: Boolean) {
        super.setHovered(hovered)
    }

    override fun onHoverChanged(hovered: Boolean) {
        super.onHoverChanged(hovered)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }

    override fun cancelLongPress() {
        super.cancelLongPress()
    }

    override fun setTouchDelegate(delegate: TouchDelegate?) {
        super.setTouchDelegate(delegate)
    }

    override fun getTouchDelegate(): TouchDelegate {
        return super.getTouchDelegate()
    }

    override fun bringToFront() {
        super.bringToFront()
    }

    override fun onScrollChanged(horiz: Int, vert: Int, oldHoriz: Int, oldVert: Int) {
        super.onScrollChanged(horiz, vert, oldHoriz, oldVert)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
    }

    override fun dispatchDraw(canvas: Canvas) {
        super.dispatchDraw(canvas)
    }

    override fun setScrollX(value: Int) {
        super.setScrollX(value)
    }

    override fun setScrollY(value: Int) {
        super.setScrollY(value)
    }

    override fun getDrawingRect(outRect: Rect?) {
        super.getDrawingRect(outRect)
    }

    override fun getMatrix(): Matrix {
        return super.getMatrix()
    }

    override fun getCameraDistance(): Float {
        return super.getCameraDistance()
    }

    override fun setCameraDistance(distance: Float) {
        super.setCameraDistance(distance)
    }

    override fun getRotation(): Float {
        return super.getRotation()
    }

    override fun setRotation(rotation: Float) {
        super.setRotation(rotation)
    }

    override fun getRotationY(): Float {
        return super.getRotationY()
    }

    override fun setRotationY(rotationY: Float) {
        super.setRotationY(rotationY)
    }

    override fun getRotationX(): Float {
        return super.getRotationX()
    }

    override fun setRotationX(rotationX: Float) {
        super.setRotationX(rotationX)
    }

    override fun getScaleX(): Float {
        return super.getScaleX()
    }

    override fun setScaleX(scaleX: Float) {
        super.setScaleX(scaleX)
    }

    override fun getScaleY(): Float {
        return super.getScaleY()
    }

    override fun setScaleY(scaleY: Float) {
        super.setScaleY(scaleY)
    }

    override fun getPivotX(): Float {
        return super.getPivotX()
    }

    override fun setPivotX(pivotX: Float) {
        super.setPivotX(pivotX)
    }

    override fun getPivotY(): Float {
        return super.getPivotY()
    }

    override fun setPivotY(pivotY: Float) {
        super.setPivotY(pivotY)
    }

    override fun isPivotSet(): Boolean {
        return super.isPivotSet()
    }

    override fun resetPivot() {
        super.resetPivot()
    }

    override fun getAlpha(): Float {
        return super.getAlpha()
    }

    override fun forceHasOverlappingRendering(hasOverlappingRendering: Boolean) {
        super.forceHasOverlappingRendering(hasOverlappingRendering)
    }

    override fun hasOverlappingRendering(): Boolean {
        return super.hasOverlappingRendering()
    }

    override fun setAlpha(alpha: Float) {
        super.setAlpha(alpha)
    }

    override fun setTransitionAlpha(alpha: Float) {
        super.setTransitionAlpha(alpha)
    }

    override fun getTransitionAlpha(): Float {
        return super.getTransitionAlpha()
    }

    override fun setForceDarkAllowed(allow: Boolean) {
        super.setForceDarkAllowed(allow)
    }

    override fun isForceDarkAllowed(): Boolean {
        return super.isForceDarkAllowed()
    }

    override fun isDirty(): Boolean {
        return super.isDirty()
    }

    override fun getX(): Float {
        return super.getX()
    }

    override fun setX(x: Float) {
        super.setX(x)
    }

    override fun getY(): Float {
        return super.getY()
    }

    override fun setY(y: Float) {
        super.setY(y)
    }

    override fun getZ(): Float {
        return super.getZ()
    }

    override fun setZ(z: Float) {
        super.setZ(z)
    }

    override fun getElevation(): Float {
        return super.getElevation()
    }

    override fun setElevation(elevation: Float) {
        super.setElevation(elevation)
    }

    override fun getTranslationX(): Float {
        return super.getTranslationX()
    }

    override fun setTranslationX(translationX: Float) {
        super.setTranslationX(translationX)
    }

    override fun getTranslationY(): Float {
        return super.getTranslationY()
    }

    override fun setTranslationY(translationY: Float) {
        super.setTranslationY(translationY)
    }

    override fun getTranslationZ(): Float {
        return super.getTranslationZ()
    }

    override fun setTranslationZ(translationZ: Float) {
        super.setTranslationZ(translationZ)
    }

    override fun setAnimationMatrix(matrix: Matrix?) {
        super.setAnimationMatrix(matrix)
    }

    override fun getAnimationMatrix(): Matrix? {
        return super.getAnimationMatrix()
    }

    override fun getStateListAnimator(): StateListAnimator {
        return super.getStateListAnimator()
    }

    override fun setStateListAnimator(stateListAnimator: StateListAnimator?) {
        super.setStateListAnimator(stateListAnimator)
    }

    override fun setClipToOutline(clipToOutline: Boolean) {
        super.setClipToOutline(clipToOutline)
    }

    override fun setOutlineProvider(provider: ViewOutlineProvider?) {
        super.setOutlineProvider(provider)
    }

    override fun getOutlineProvider(): ViewOutlineProvider {
        return super.getOutlineProvider()
    }

    override fun invalidateOutline() {
        super.invalidateOutline()
    }

    override fun setOutlineSpotShadowColor(color: Int) {
        super.setOutlineSpotShadowColor(color)
    }

    override fun getOutlineSpotShadowColor(): Int {
        return super.getOutlineSpotShadowColor()
    }

    override fun setOutlineAmbientShadowColor(color: Int) {
        super.setOutlineAmbientShadowColor(color)
    }

    override fun getOutlineAmbientShadowColor(): Int {
        return super.getOutlineAmbientShadowColor()
    }

    override fun getHitRect(outRect: Rect?) {
        super.getHitRect(outRect)
    }

    override fun getFocusedRect(r: Rect?) {
        super.getFocusedRect(r)
    }

    override fun getGlobalVisibleRect(r: Rect?, globalOffset: Point?): Boolean {
        return super.getGlobalVisibleRect(r, globalOffset)
    }

    override fun offsetTopAndBottom(offset: Int) {
        super.offsetTopAndBottom(offset)
    }

    override fun offsetLeftAndRight(offset: Int) {
        super.offsetLeftAndRight(offset)
    }

    override fun getLayoutParams(): ViewGroup.LayoutParams {
        return super.getLayoutParams()
    }

    override fun setLayoutParams(params: ViewGroup.LayoutParams?) {
        super.setLayoutParams(params)
    }

    override fun scrollTo(x: Int, y: Int) {
        super.scrollTo(x, y)
    }

    override fun scrollBy(x: Int, y: Int) {
        super.scrollBy(x, y)
    }

    override fun awakenScrollBars(): Boolean {
        return super.awakenScrollBars()
    }

    override fun awakenScrollBars(startDelay: Int): Boolean {
        return super.awakenScrollBars(startDelay)
    }

    override fun awakenScrollBars(startDelay: Int, invalidate: Boolean): Boolean {
        return super.awakenScrollBars(startDelay, invalidate)
    }

    override fun invalidate(dirty: Rect?) {
        super.invalidate(dirty)
    }

    override fun invalidate(l: Int, t: Int, r: Int, b: Int) {
        super.invalidate(l, t, r, b)
    }

    override fun invalidate() {
        super.invalidate()
    }

    override fun isOpaque(): Boolean {
        return super.isOpaque()
    }

    override fun getHandler(): Handler {
        return super.getHandler()
    }

    override fun post(action: Runnable?): Boolean {
        return super.post(action)
    }

    override fun postDelayed(action: Runnable?, delayMillis: Long): Boolean {
        return super.postDelayed(action, delayMillis)
    }

    override fun postOnAnimation(action: Runnable?) {
        super.postOnAnimation(action)
    }

    override fun postOnAnimationDelayed(action: Runnable?, delayMillis: Long) {
        super.postOnAnimationDelayed(action, delayMillis)
    }

    override fun removeCallbacks(action: Runnable?): Boolean {
        return super.removeCallbacks(action)
    }

    override fun postInvalidate() {
        super.postInvalidate()
    }

    override fun postInvalidate(left: Int, top: Int, right: Int, bottom: Int) {
        super.postInvalidate(left, top, right, bottom)
    }

    override fun postInvalidateDelayed(delayMilliseconds: Long) {
        super.postInvalidateDelayed(delayMilliseconds)
    }

    override fun postInvalidateDelayed(
        delayMilliseconds: Long,
        left: Int,
        top: Int,
        right: Int,
        bottom: Int
    ) {
        super.postInvalidateDelayed(delayMilliseconds, left, top, right, bottom)
    }

    override fun postInvalidateOnAnimation() {
        super.postInvalidateOnAnimation()
    }

    override fun postInvalidateOnAnimation(left: Int, top: Int, right: Int, bottom: Int) {
        super.postInvalidateOnAnimation(left, top, right, bottom)
    }

    override fun computeScroll() {
        super.computeScroll()
    }

    override fun isHorizontalFadingEdgeEnabled(): Boolean {
        return super.isHorizontalFadingEdgeEnabled()
    }

    override fun setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled: Boolean) {
        super.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled)
    }

    override fun isVerticalFadingEdgeEnabled(): Boolean {
        return super.isVerticalFadingEdgeEnabled()
    }

    override fun setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled: Boolean) {
        super.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled)
    }

    override fun getTopFadingEdgeStrength(): Float {
        return super.getTopFadingEdgeStrength()
    }

    override fun getBottomFadingEdgeStrength(): Float {
        return super.getBottomFadingEdgeStrength()
    }

    override fun getLeftFadingEdgeStrength(): Float {
        return super.getLeftFadingEdgeStrength()
    }

    override fun getRightFadingEdgeStrength(): Float {
        return super.getRightFadingEdgeStrength()
    }

    override fun isHorizontalScrollBarEnabled(): Boolean {
        return super.isHorizontalScrollBarEnabled()
    }

    override fun setHorizontalScrollBarEnabled(horizontalScrollBarEnabled: Boolean) {
        super.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled)
    }

    override fun isVerticalScrollBarEnabled(): Boolean {
        return super.isVerticalScrollBarEnabled()
    }

    override fun setVerticalScrollBarEnabled(verticalScrollBarEnabled: Boolean) {
        super.setVerticalScrollBarEnabled(verticalScrollBarEnabled)
    }

    override fun setScrollbarFadingEnabled(fadeScrollbars: Boolean) {
        super.setScrollbarFadingEnabled(fadeScrollbars)
    }

    override fun isScrollbarFadingEnabled(): Boolean {
        return super.isScrollbarFadingEnabled()
    }

    override fun getScrollBarDefaultDelayBeforeFade(): Int {
        return super.getScrollBarDefaultDelayBeforeFade()
    }

    override fun setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade: Int) {
        super.setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade)
    }

    override fun getScrollBarFadeDuration(): Int {
        return super.getScrollBarFadeDuration()
    }

    override fun setScrollBarFadeDuration(scrollBarFadeDuration: Int) {
        super.setScrollBarFadeDuration(scrollBarFadeDuration)
    }

    override fun getScrollBarSize(): Int {
        return super.getScrollBarSize()
    }

    override fun setScrollBarSize(scrollBarSize: Int) {
        super.setScrollBarSize(scrollBarSize)
    }

    override fun setScrollBarStyle(style: Int) {
        super.setScrollBarStyle(style)
    }

    override fun getScrollBarStyle(): Int {
        return super.getScrollBarStyle()
    }

    override fun computeHorizontalScrollRange(): Int {
        return super.computeHorizontalScrollRange()
    }

    override fun computeHorizontalScrollOffset(): Int {
        return super.computeHorizontalScrollOffset()
    }

    override fun computeHorizontalScrollExtent(): Int {
        return super.computeHorizontalScrollExtent()
    }

    override fun computeVerticalScrollRange(): Int {
        return super.computeVerticalScrollRange()
    }

    override fun computeVerticalScrollOffset(): Int {
        return super.computeVerticalScrollOffset()
    }

    override fun computeVerticalScrollExtent(): Int {
        return super.computeVerticalScrollExtent()
    }

    override fun canScrollHorizontally(direction: Int): Boolean {
        return super.canScrollHorizontally(direction)
    }

    override fun canScrollVertically(direction: Int): Boolean {
        return super.canScrollVertically(direction)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
    }

    override fun onScreenStateChanged(screenState: Int) {
        super.onScreenStateChanged(screenState)
    }

    override fun onRtlPropertiesChanged(layoutDirection: Int) {
        super.onRtlPropertiesChanged(layoutDirection)
    }

    override fun canResolveLayoutDirection(): Boolean {
        return super.canResolveLayoutDirection()
    }

    override fun isLayoutDirectionResolved(): Boolean {
        return super.isLayoutDirectionResolved()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
    }

    override fun getWindowAttachCount(): Int {
        return super.getWindowAttachCount()
    }

    override fun getWindowToken(): IBinder {
        return super.getWindowToken()
    }

    override fun getWindowId(): WindowId {
        return super.getWindowId()
    }

    override fun getApplicationWindowToken(): IBinder {
        return super.getApplicationWindowToken()
    }

    override fun getDisplay(): Display {
        return super.getDisplay()
    }

    override fun onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents()
    }

    override fun saveHierarchyState(container: SparseArray<Parcelable>?) {
        super.saveHierarchyState(container)
    }

    override fun dispatchSaveInstanceState(container: SparseArray<Parcelable>?) {
        super.dispatchSaveInstanceState(container)
    }

    override fun onSaveInstanceState(): Parcelable? {
        return super.onSaveInstanceState()
    }

    override fun restoreHierarchyState(container: SparseArray<Parcelable>?) {
        super.restoreHierarchyState(container)
    }

    override fun dispatchRestoreInstanceState(container: SparseArray<Parcelable>?) {
        super.dispatchRestoreInstanceState(container)
    }

    override fun onRestoreInstanceState(state: Parcelable?) {
        super.onRestoreInstanceState(state)
    }

    override fun getDrawingTime(): Long {
        return super.getDrawingTime()
    }

    override fun setDuplicateParentStateEnabled(enabled: Boolean) {
        super.setDuplicateParentStateEnabled(enabled)
    }

    override fun isDuplicateParentStateEnabled(): Boolean {
        return super.isDuplicateParentStateEnabled()
    }

    override fun setLayerType(layerType: Int, paint: Paint?) {
        super.setLayerType(layerType, paint)
    }

    override fun setRenderEffect(renderEffect: RenderEffect?) {
        super.setRenderEffect(renderEffect)
    }

    override fun setLayerPaint(paint: Paint?) {
        super.setLayerPaint(paint)
    }

    override fun getLayerType(): Int {
        return super.getLayerType()
    }

    override fun buildLayer() {
        super.buildLayer()
    }

    override fun setDrawingCacheEnabled(enabled: Boolean) {
        super.setDrawingCacheEnabled(enabled)
    }

    override fun isDrawingCacheEnabled(): Boolean {
        return super.isDrawingCacheEnabled()
    }

    override fun getDrawingCache(): Bitmap {
        return super.getDrawingCache()
    }

    override fun getDrawingCache(autoScale: Boolean): Bitmap {
        return super.getDrawingCache(autoScale)
    }

    override fun destroyDrawingCache() {
        super.destroyDrawingCache()
    }

    override fun setDrawingCacheBackgroundColor(color: Int) {
        super.setDrawingCacheBackgroundColor(color)
    }

    override fun getDrawingCacheBackgroundColor(): Int {
        return super.getDrawingCacheBackgroundColor()
    }

    override fun buildDrawingCache() {
        super.buildDrawingCache()
    }

    override fun buildDrawingCache(autoScale: Boolean) {
        super.buildDrawingCache(autoScale)
    }

    override fun isInEditMode(): Boolean {
        return super.isInEditMode()
    }

    override fun isPaddingOffsetRequired(): Boolean {
        return super.isPaddingOffsetRequired()
    }

    override fun getLeftPaddingOffset(): Int {
        return super.getLeftPaddingOffset()
    }

    override fun getRightPaddingOffset(): Int {
        return super.getRightPaddingOffset()
    }

    override fun getTopPaddingOffset(): Int {
        return super.getTopPaddingOffset()
    }

    override fun getBottomPaddingOffset(): Int {
        return super.getBottomPaddingOffset()
    }

    override fun isHardwareAccelerated(): Boolean {
        return super.isHardwareAccelerated()
    }

    override fun setClipBounds(clipBounds: Rect?) {
        super.setClipBounds(clipBounds)
    }

    override fun getClipBounds(): Rect {
        return super.getClipBounds()
    }

    override fun getClipBounds(outRect: Rect?): Boolean {
        return super.getClipBounds(outRect)
    }

    override fun draw(canvas: Canvas) {
        super.draw(canvas)
    }

    override fun getOverlay(): ViewOverlay {
        return super.getOverlay()
    }

    override fun getSolidColor(): Int {
        return super.getSolidColor()
    }

    override fun isLayoutRequested(): Boolean {
        return super.isLayoutRequested()
    }

    override fun layout(l: Int, t: Int, r: Int, b: Int) {
        super.layout(l, t, r, b)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    override fun getResources(): Resources {
        return super.getResources()
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who)
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
    }

    override fun drawableHotspotChanged(x: Float, y: Float) {
        super.drawableHotspotChanged(x, y)
    }

    override fun dispatchDrawableHotspotChanged(x: Float, y: Float) {
        super.dispatchDrawableHotspotChanged(x, y)
    }

    override fun refreshDrawableState() {
        super.refreshDrawableState()
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        return super.onCreateDrawableState(extraSpace)
    }

    override fun jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState()
    }

    override fun setBackgroundColor(color: Int) {
        super.setBackgroundColor(color)
    }

    override fun setBackgroundResource(resId: Int) {
        super.setBackgroundResource(resId)
    }

    override fun setBackground(background: Drawable?) {
        super.setBackground(background)
    }

    override fun setBackgroundDrawable(background: Drawable?) {
        super.setBackgroundDrawable(background)
    }

    override fun getBackground(): Drawable {
        return super.getBackground()
    }

    override fun setBackgroundTintList(tint: ColorStateList?) {
        super.setBackgroundTintList(tint)
    }

    override fun getBackgroundTintList(): ColorStateList? {
        return super.getBackgroundTintList()
    }

    override fun setBackgroundTintMode(tintMode: PorterDuff.Mode?) {
        super.setBackgroundTintMode(tintMode)
    }

    override fun setBackgroundTintBlendMode(blendMode: BlendMode?) {
        super.setBackgroundTintBlendMode(blendMode)
    }

    override fun getBackgroundTintMode(): PorterDuff.Mode? {
        return super.getBackgroundTintMode()
    }

    override fun getBackgroundTintBlendMode(): BlendMode? {
        return super.getBackgroundTintBlendMode()
    }

    override fun getForeground(): Drawable {
        return super.getForeground()
    }

    override fun setForeground(foreground: Drawable?) {
        super.setForeground(foreground)
    }

    override fun getForegroundGravity(): Int {
        return super.getForegroundGravity()
    }

    override fun setForegroundGravity(gravity: Int) {
        super.setForegroundGravity(gravity)
    }

    override fun setForegroundTintList(tint: ColorStateList?) {
        super.setForegroundTintList(tint)
    }

    override fun getForegroundTintList(): ColorStateList? {
        return super.getForegroundTintList()
    }

    override fun setForegroundTintMode(tintMode: PorterDuff.Mode?) {
        super.setForegroundTintMode(tintMode)
    }

    override fun setForegroundTintBlendMode(blendMode: BlendMode?) {
        super.setForegroundTintBlendMode(blendMode)
    }

    override fun getForegroundTintMode(): PorterDuff.Mode? {
        return super.getForegroundTintMode()
    }

    override fun getForegroundTintBlendMode(): BlendMode? {
        return super.getForegroundTintBlendMode()
    }

    override fun onDrawForeground(canvas: Canvas) {
        super.onDrawForeground(canvas)
    }

    override fun setPadding(left: Int, top: Int, right: Int, bottom: Int) {
        super.setPadding(left, top, right, bottom)
    }

    override fun setPaddingRelative(start: Int, top: Int, end: Int, bottom: Int) {
        super.setPaddingRelative(start, top, end, bottom)
    }

    override fun getSourceLayoutResId(): Int {
        return super.getSourceLayoutResId()
    }

    override fun getPaddingTop(): Int {
        return super.getPaddingTop()
    }

    override fun getPaddingBottom(): Int {
        return super.getPaddingBottom()
    }

    override fun getPaddingLeft(): Int {
        return super.getPaddingLeft()
    }

    override fun getPaddingStart(): Int {
        return super.getPaddingStart()
    }

    override fun getPaddingRight(): Int {
        return super.getPaddingRight()
    }

    override fun getPaddingEnd(): Int {
        return super.getPaddingEnd()
    }

    override fun isPaddingRelative(): Boolean {
        return super.isPaddingRelative()
    }

    override fun setSelected(selected: Boolean) {
        super.setSelected(selected)
    }

    override fun dispatchSetSelected(selected: Boolean) {
        super.dispatchSetSelected(selected)
    }

    override fun isSelected(): Boolean {
        return super.isSelected()
    }

    override fun setActivated(activated: Boolean) {
        super.setActivated(activated)
    }

    override fun dispatchSetActivated(activated: Boolean) {
        super.dispatchSetActivated(activated)
    }

    override fun isActivated(): Boolean {
        return super.isActivated()
    }

    override fun getViewTreeObserver(): ViewTreeObserver {
        return super.getViewTreeObserver()
    }

    override fun getRootView(): View {
        return super.getRootView()
    }

    override fun transformMatrixToGlobal(matrix: Matrix) {
        super.transformMatrixToGlobal(matrix)
    }

    override fun transformMatrixToLocal(matrix: Matrix) {
        super.transformMatrixToLocal(matrix)
    }

    override fun getLocationOnScreen(outLocation: IntArray?) {
        super.getLocationOnScreen(outLocation)
    }

    override fun getLocationInWindow(outLocation: IntArray?) {
        super.getLocationInWindow(outLocation)
    }

    override fun setId(id: Int) {
        super.setId(id)
    }

    override fun getId(): Int {
        return super.getId()
    }

    override fun getUniqueDrawingId(): Long {
        return super.getUniqueDrawingId()
    }

    override fun getTag(): Any {
        return super.getTag()
    }

    override fun getTag(key: Int): Any {
        return super.getTag(key)
    }

    override fun setTag(tag: Any?) {
        super.setTag(tag)
    }

    override fun setTag(key: Int, tag: Any?) {
        super.setTag(key, tag)
    }

    override fun getBaseline(): Int {
        return super.getBaseline()
    }

    override fun isInLayout(): Boolean {
        return super.isInLayout()
    }

    override fun requestLayout() {
        super.requestLayout()
    }

    override fun forceLayout() {
        super.forceLayout()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun getSuggestedMinimumHeight(): Int {
        return super.getSuggestedMinimumHeight()
    }

    override fun getSuggestedMinimumWidth(): Int {
        return super.getSuggestedMinimumWidth()
    }

    override fun getMinimumHeight(): Int {
        return super.getMinimumHeight()
    }

    override fun setMinimumHeight(minHeight: Int) {
        super.setMinimumHeight(minHeight)
    }

    override fun getMinimumWidth(): Int {
        return super.getMinimumWidth()
    }

    override fun setMinimumWidth(minWidth: Int) {
        super.setMinimumWidth(minWidth)
    }

    override fun getAnimation(): Animation {
        return super.getAnimation()
    }

    override fun startAnimation(animation: Animation?) {
        super.startAnimation(animation)
    }

    override fun clearAnimation() {
        super.clearAnimation()
    }

    override fun setAnimation(animation: Animation?) {
        super.setAnimation(animation)
    }

    override fun onAnimationStart() {
        super.onAnimationStart()
    }

    override fun onAnimationEnd() {
        super.onAnimationEnd()
    }

    override fun onSetAlpha(alpha: Int): Boolean {
        return super.onSetAlpha(alpha)
    }

    override fun gatherTransparentRegion(region: Region?): Boolean {
        return super.gatherTransparentRegion(region)
    }

    override fun playSoundEffect(soundConstant: Int) {
        super.playSoundEffect(soundConstant)
    }

    override fun performHapticFeedback(feedbackConstant: Int): Boolean {
        return super.performHapticFeedback(feedbackConstant)
    }

    override fun performHapticFeedback(feedbackConstant: Int, flags: Int): Boolean {
        return super.performHapticFeedback(feedbackConstant, flags)
    }

    override fun setSystemUiVisibility(visibility: Int) {
        super.setSystemUiVisibility(visibility)
    }

    override fun getSystemUiVisibility(): Int {
        return super.getSystemUiVisibility()
    }

    override fun getWindowSystemUiVisibility(): Int {
        return super.getWindowSystemUiVisibility()
    }

    override fun onWindowSystemUiVisibilityChanged(visible: Int) {
        super.onWindowSystemUiVisibilityChanged(visible)
    }

    override fun dispatchWindowSystemUiVisiblityChanged(visible: Int) {
        super.dispatchWindowSystemUiVisiblityChanged(visible)
    }

    override fun setOnSystemUiVisibilityChangeListener(l: OnSystemUiVisibilityChangeListener?) {
        super.setOnSystemUiVisibilityChangeListener(l)
    }

    override fun dispatchSystemUiVisibilityChanged(visibility: Int) {
        super.dispatchSystemUiVisibilityChanged(visibility)
    }

    override fun onDragEvent(event: DragEvent?): Boolean {
        return super.onDragEvent(event)
    }

    override fun dispatchDragEvent(event: DragEvent?): Boolean {
        return super.dispatchDragEvent(event)
    }

    override fun overScrollBy(
        deltaX: Int,
        deltaY: Int,
        scrollX: Int,
        scrollY: Int,
        scrollRangeX: Int,
        scrollRangeY: Int,
        maxOverScrollX: Int,
        maxOverScrollY: Int,
        isTouchEvent: Boolean
    ): Boolean {
        return super.overScrollBy(
            deltaX,
            deltaY,
            scrollX,
            scrollY,
            scrollRangeX,
            scrollRangeY,
            maxOverScrollX,
            maxOverScrollY,
            isTouchEvent
        )
    }

    override fun onOverScrolled(scrollX: Int, scrollY: Int, clampedX: Boolean, clampedY: Boolean) {
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY)
    }

    override fun getOverScrollMode(): Int {
        return super.getOverScrollMode()
    }

    override fun setOverScrollMode(overScrollMode: Int) {
        super.setOverScrollMode(overScrollMode)
    }

    override fun setNestedScrollingEnabled(enabled: Boolean) {
        super.setNestedScrollingEnabled(enabled)
    }

    override fun isNestedScrollingEnabled(): Boolean {
        return super.isNestedScrollingEnabled()
    }

    override fun startNestedScroll(axes: Int): Boolean {
        return super.startNestedScroll(axes)
    }

    override fun stopNestedScroll() {
        super.stopNestedScroll()
    }

    override fun hasNestedScrollingParent(): Boolean {
        return super.hasNestedScrollingParent()
    }

    override fun dispatchNestedScroll(
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        offsetInWindow: IntArray?
    ): Boolean {
        return super.dispatchNestedScroll(
            dxConsumed,
            dyConsumed,
            dxUnconsumed,
            dyUnconsumed,
            offsetInWindow
        )
    }

    override fun dispatchNestedPreScroll(
        dx: Int,
        dy: Int,
        consumed: IntArray?,
        offsetInWindow: IntArray?
    ): Boolean {
        return super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow)
    }

    override fun dispatchNestedFling(
        velocityX: Float,
        velocityY: Float,
        consumed: Boolean
    ): Boolean {
        return super.dispatchNestedFling(velocityX, velocityY, consumed)
    }

    override fun dispatchNestedPreFling(velocityX: Float, velocityY: Float): Boolean {
        return super.dispatchNestedPreFling(velocityX, velocityY)
    }

    override fun setTextDirection(textDirection: Int) {
        super.setTextDirection(textDirection)
    }

    override fun getTextDirection(): Int {
        return super.getTextDirection()
    }

    override fun canResolveTextDirection(): Boolean {
        return super.canResolveTextDirection()
    }

    override fun isTextDirectionResolved(): Boolean {
        return super.isTextDirectionResolved()
    }

    override fun setTextAlignment(textAlignment: Int) {
        super.setTextAlignment(textAlignment)
    }

    override fun getTextAlignment(): Int {
        return super.getTextAlignment()
    }

    override fun canResolveTextAlignment(): Boolean {
        return super.canResolveTextAlignment()
    }

    override fun isTextAlignmentResolved(): Boolean {
        return super.isTextAlignmentResolved()
    }

    override fun onResolvePointerIcon(event: MotionEvent?, pointerIndex: Int): PointerIcon {
        return super.onResolvePointerIcon(event, pointerIndex)
    }

    override fun setPointerIcon(pointerIcon: PointerIcon?) {
        super.setPointerIcon(pointerIcon)
    }

    override fun getPointerIcon(): PointerIcon {
        return super.getPointerIcon()
    }

    override fun hasPointerCapture(): Boolean {
        return super.hasPointerCapture()
    }

    override fun requestPointerCapture() {
        super.requestPointerCapture()
    }

    override fun releasePointerCapture() {
        super.releasePointerCapture()
    }

    override fun onPointerCaptureChange(hasCapture: Boolean) {
        super.onPointerCaptureChange(hasCapture)
    }

    override fun dispatchPointerCaptureChanged(hasCapture: Boolean) {
        super.dispatchPointerCaptureChanged(hasCapture)
    }

    override fun onCapturedPointerEvent(event: MotionEvent?): Boolean {
        return super.onCapturedPointerEvent(event)
    }

    override fun setOnCapturedPointerListener(l: OnCapturedPointerListener?) {
        super.setOnCapturedPointerListener(l)
    }

    override fun animate(): ViewPropertyAnimator {
        return super.animate()
    }

    override fun getTransitionName(): String {
        return super.getTransitionName()
    }

    override fun getScrollCaptureHint(): Int {
        return super.getScrollCaptureHint()
    }

    override fun setScrollCaptureHint(hint: Int) {
        super.setScrollCaptureHint(hint)
    }

    override fun dispatchScrollCaptureSearch(
        localVisibleRect: Rect,
        windowOffset: Point,
        targets: Consumer<ScrollCaptureTarget>
    ) {
        super.dispatchScrollCaptureSearch(localVisibleRect, windowOffset, targets)
    }

    override fun onScrollCaptureSearch(
        localVisibleRect: Rect,
        windowOffset: Point,
        targets: Consumer<ScrollCaptureTarget>
    ) {
        super.onScrollCaptureSearch(localVisibleRect, windowOffset, targets)
    }

    override fun setTooltipText(tooltipText: CharSequence?) {
        super.setTooltipText(tooltipText)
    }

    override fun getTooltipText(): CharSequence? {
        return super.getTooltipText()
    }

    override fun addOnUnhandledKeyEventListener(listener: OnUnhandledKeyEventListener?) {
        super.addOnUnhandledKeyEventListener(listener)
    }

    override fun removeOnUnhandledKeyEventListener(listener: OnUnhandledKeyEventListener?) {
        super.removeOnUnhandledKeyEventListener(listener)
    }

    override fun setIsCredential(isCredential: Boolean) {
        super.setIsCredential(isCredential)
    }

    override fun isCredential(): Boolean {
        return super.isCredential()
    }

    override fun setAutoHandwritingEnabled(enabled: Boolean) {
        super.setAutoHandwritingEnabled(enabled)
    }

    override fun isAutoHandwritingEnabled(): Boolean {
        return super.isAutoHandwritingEnabled()
    }

    override fun onCreateViewTranslationRequest(
        supportedFormats: IntArray,
        requestsCollector: Consumer<ViewTranslationRequest>
    ) {
        super.onCreateViewTranslationRequest(supportedFormats, requestsCollector)
    }

    override fun onCreateVirtualViewTranslationRequests(
        virtualIds: LongArray,
        supportedFormats: IntArray,
        requestsCollector: Consumer<ViewTranslationRequest>
    ) {
        super.onCreateVirtualViewTranslationRequests(
            virtualIds,
            supportedFormats,
            requestsCollector
        )
    }

    override fun setViewTranslationCallback(callback: ViewTranslationCallback) {
        super.setViewTranslationCallback(callback)
    }

    override fun clearViewTranslationCallback() {
        super.clearViewTranslationCallback()
    }

    override fun getViewTranslationResponse(): ViewTranslationResponse? {
        return super.getViewTranslationResponse()
    }

    override fun onViewTranslationResponse(response: ViewTranslationResponse) {
        super.onViewTranslationResponse(response)
    }

    override fun onVirtualViewTranslationResponses(response: LongSparseArray<ViewTranslationResponse>) {
        super.onVirtualViewTranslationResponses(response)
    }

    override fun dispatchCreateViewTranslationRequest(
        viewIds: MutableMap<AutofillId, LongArray>,
        supportedFormats: IntArray,
        capability: TranslationCapability,
        requests: MutableList<ViewTranslationRequest>
    ) {
        super.dispatchCreateViewTranslationRequest(viewIds, supportedFormats, capability, requests)
    }

    override fun generateDisplayHash(
        hashAlgorithm: String,
        bounds: Rect?,
        executor: Executor,
        callback: DisplayHashResultCallback
    ) {
        super.generateDisplayHash(hashAlgorithm, bounds, executor, callback)
    }

    override fun getRootSurfaceControl(): AttachedSurfaceControl? {
        return super.getRootSurfaceControl()
    }

    override fun onPreDraw(): Boolean {
        return super.onPreDraw()
    }


    override fun setTypeface(tf: Typeface?, style: Int) {
        super.setTypeface(tf, style)
    }

    override fun setTypeface(tf: Typeface?) {
        super.setTypeface(tf)
    }

    override fun getDefaultEditable(): Boolean {
        return super.getDefaultEditable()
    }

    override fun getDefaultMovementMethod(): MovementMethod {
        return super.getDefaultMovementMethod()
    }

    override fun getText(): CharSequence {
        return super.getText()
    }

    override fun length(): Int {
        return super.length()
    }

    override fun getEditableText(): Editable {
        return super.getEditableText()
    }

    override fun getLineHeight(): Int {
        return super.getLineHeight()
    }

    override fun setKeyListener(input: KeyListener?) {
        super.setKeyListener(input)
    }

    override fun getCompoundPaddingTop(): Int {
        return super.getCompoundPaddingTop()
    }

    override fun getCompoundPaddingBottom(): Int {
        return super.getCompoundPaddingBottom()
    }

    override fun getCompoundPaddingLeft(): Int {
        return super.getCompoundPaddingLeft()
    }

    override fun getCompoundPaddingRight(): Int {
        return super.getCompoundPaddingRight()
    }

    override fun getCompoundPaddingStart(): Int {
        return super.getCompoundPaddingStart()
    }

    override fun getCompoundPaddingEnd(): Int {
        return super.getCompoundPaddingEnd()
    }

    override fun getExtendedPaddingTop(): Int {
        return super.getExtendedPaddingTop()
    }

    override fun getExtendedPaddingBottom(): Int {
        return super.getExtendedPaddingBottom()
    }

    override fun getTotalPaddingLeft(): Int {
        return super.getTotalPaddingLeft()
    }

    override fun getTotalPaddingRight(): Int {
        return super.getTotalPaddingRight()
    }

    override fun getTotalPaddingStart(): Int {
        return super.getTotalPaddingStart()
    }

    override fun getTotalPaddingEnd(): Int {
        return super.getTotalPaddingEnd()
    }

    override fun getTotalPaddingTop(): Int {
        return super.getTotalPaddingTop()
    }

    override fun getTotalPaddingBottom(): Int {
        return super.getTotalPaddingBottom()
    }

    override fun setCompoundDrawables(
        left: Drawable?,
        top: Drawable?,
        right: Drawable?,
        bottom: Drawable?
    ) {
        super.setCompoundDrawables(left, top, right, bottom)
    }

    override fun setCompoundDrawablesWithIntrinsicBounds(
        left: Drawable?,
        top: Drawable?,
        right: Drawable?,
        bottom: Drawable?
    ) {
        super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom)
    }

    override fun setCompoundDrawablesWithIntrinsicBounds(
        left: Int,
        top: Int,
        right: Int,
        bottom: Int
    ) {
        super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom)
    }

    override fun setCompoundDrawablesRelative(
        start: Drawable?,
        top: Drawable?,
        end: Drawable?,
        bottom: Drawable?
    ) {
        super.setCompoundDrawablesRelative(start, top, end, bottom)
    }

    override fun setCompoundDrawablesRelativeWithIntrinsicBounds(
        start: Drawable?,
        top: Drawable?,
        end: Drawable?,
        bottom: Drawable?
    ) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)
    }

    override fun setCompoundDrawablesRelativeWithIntrinsicBounds(
        start: Int,
        top: Int,
        end: Int,
        bottom: Int
    ) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)
    }

    override fun getCompoundDrawables(): Array<Drawable> {
        return super.getCompoundDrawables()
    }

    override fun getCompoundDrawablesRelative(): Array<Drawable> {
        return super.getCompoundDrawablesRelative()
    }

    override fun setCompoundDrawablePadding(pad: Int) {
        super.setCompoundDrawablePadding(pad)
    }

    override fun getCompoundDrawablePadding(): Int {
        return super.getCompoundDrawablePadding()
    }

    override fun setCompoundDrawableTintList(tint: ColorStateList?) {
        super.setCompoundDrawableTintList(tint)
    }

    override fun getCompoundDrawableTintList(): ColorStateList {
        return super.getCompoundDrawableTintList()
    }

    override fun setCompoundDrawableTintMode(tintMode: PorterDuff.Mode?) {
        super.setCompoundDrawableTintMode(tintMode)
    }

    override fun setCompoundDrawableTintBlendMode(blendMode: BlendMode?) {
        super.setCompoundDrawableTintBlendMode(blendMode)
    }

    override fun getCompoundDrawableTintMode(): PorterDuff.Mode {
        return super.getCompoundDrawableTintMode()
    }

    override fun getCompoundDrawableTintBlendMode(): BlendMode? {
        return super.getCompoundDrawableTintBlendMode()
    }

    override fun setFirstBaselineToTopHeight(firstBaselineToTopHeight: Int) {
        super.setFirstBaselineToTopHeight(firstBaselineToTopHeight)
    }

    override fun setLastBaselineToBottomHeight(lastBaselineToBottomHeight: Int) {
        super.setLastBaselineToBottomHeight(lastBaselineToBottomHeight)
    }

    override fun getFirstBaselineToTopHeight(): Int {
        return super.getFirstBaselineToTopHeight()
    }

    override fun getLastBaselineToBottomHeight(): Int {
        return super.getLastBaselineToBottomHeight()
    }

    override fun setTextSelectHandle(textSelectHandle: Drawable) {
        super.setTextSelectHandle(textSelectHandle)
    }

    override fun setTextSelectHandle(textSelectHandle: Int) {
        super.setTextSelectHandle(textSelectHandle)
    }

    override fun getTextSelectHandle(): Drawable? {
        return super.getTextSelectHandle()
    }

    override fun setTextSelectHandleLeft(textSelectHandleLeft: Drawable) {
        super.setTextSelectHandleLeft(textSelectHandleLeft)
    }

    override fun setTextSelectHandleLeft(textSelectHandleLeft: Int) {
        super.setTextSelectHandleLeft(textSelectHandleLeft)
    }

    override fun getTextSelectHandleLeft(): Drawable? {
        return super.getTextSelectHandleLeft()
    }

    override fun setTextSelectHandleRight(textSelectHandleRight: Drawable) {
        super.setTextSelectHandleRight(textSelectHandleRight)
    }

    override fun setTextSelectHandleRight(textSelectHandleRight: Int) {
        super.setTextSelectHandleRight(textSelectHandleRight)
    }

    override fun getTextSelectHandleRight(): Drawable? {
        return super.getTextSelectHandleRight()
    }

    override fun setTextCursorDrawable(textCursorDrawable: Drawable?) {
        super.setTextCursorDrawable(textCursorDrawable)
    }

    override fun setTextCursorDrawable(textCursorDrawable: Int) {
        super.setTextCursorDrawable(textCursorDrawable)
    }

    override fun getTextCursorDrawable(): Drawable? {
        return super.getTextCursorDrawable()
    }

    override fun setTextAppearance(context: Context?, resId: Int) {
        super.setTextAppearance(context, resId)
    }

    override fun setTextAppearance(resId: Int) {
        super.setTextAppearance(resId)
    }

    override fun getTextLocale(): Locale {
        return super.getTextLocale()
    }

    override fun getTextLocales(): LocaleList {
        return super.getTextLocales()
    }

    override fun setTextLocale(locale: Locale) {
        super.setTextLocale(locale)
    }

    override fun setTextLocales(locales: LocaleList) {
        super.setTextLocales(locales)
    }

    override fun getTextSize(): Float {
        return super.getTextSize()
    }

    override fun setTextSize(unit: Int, size: Float) {
        super.setTextSize(unit, size)
    }

    override fun setTextSize(size: Float) {
        super.setTextSize(size)
    }

    override fun getTextSizeUnit(): Int {
        return super.getTextSizeUnit()
    }

    override fun getTextScaleX(): Float {
        return super.getTextScaleX()
    }

    override fun setTextScaleX(size: Float) {
        super.setTextScaleX(size)
    }

    override fun getTypeface(): Typeface {
        return super.getTypeface()
    }

    override fun setElegantTextHeight(elegant: Boolean) {
        super.setElegantTextHeight(elegant)
    }

    override fun setFallbackLineSpacing(enabled: Boolean) {
        super.setFallbackLineSpacing(enabled)
    }

    override fun isFallbackLineSpacing(): Boolean {
        return super.isFallbackLineSpacing()
    }

    override fun isElegantTextHeight(): Boolean {
        return super.isElegantTextHeight()
    }

    override fun getLetterSpacing(): Float {
        return super.getLetterSpacing()
    }

    override fun setLetterSpacing(letterSpacing: Float) {
        super.setLetterSpacing(letterSpacing)
    }

    override fun getFontFeatureSettings(): String? {
        return super.getFontFeatureSettings()
    }

    override fun getFontVariationSettings(): String? {
        return super.getFontVariationSettings()
    }

    override fun setBreakStrategy(breakStrategy: Int) {
        super.setBreakStrategy(breakStrategy)
    }

    override fun getBreakStrategy(): Int {
        return super.getBreakStrategy()
    }

    override fun setHyphenationFrequency(hyphenationFrequency: Int) {
        super.setHyphenationFrequency(hyphenationFrequency)
    }

    override fun getHyphenationFrequency(): Int {
        return super.getHyphenationFrequency()
    }

    override fun setLineBreakStyle(lineBreakStyle: Int) {
        super.setLineBreakStyle(lineBreakStyle)
    }

    override fun setLineBreakWordStyle(lineBreakWordStyle: Int) {
        super.setLineBreakWordStyle(lineBreakWordStyle)
    }

    override fun getLineBreakStyle(): Int {
        return super.getLineBreakStyle()
    }

    override fun getLineBreakWordStyle(): Int {
        return super.getLineBreakWordStyle()
    }

    override fun getTextMetricsParams(): PrecomputedText.Params {
        return super.getTextMetricsParams()
    }

    override fun setTextMetricsParams(params: PrecomputedText.Params) {
        super.setTextMetricsParams(params)
    }

    override fun setJustificationMode(justificationMode: Int) {
        super.setJustificationMode(justificationMode)
    }

    override fun getJustificationMode(): Int {
        return super.getJustificationMode()
    }

    override fun setFontFeatureSettings(fontFeatureSettings: String?) {
        super.setFontFeatureSettings(fontFeatureSettings)
    }

    override fun setFontVariationSettings(fontVariationSettings: String?): Boolean {
        return super.setFontVariationSettings(fontVariationSettings)
    }

    override fun setTextColor(color: Int) {
        super.setTextColor(color)
    }

    override fun setTextColor(colors: ColorStateList?) {
        super.setTextColor(colors)
    }

    override fun setHighlightColor(color: Int) {
        super.setHighlightColor(color)
    }

    override fun getHighlightColor(): Int {
        return super.getHighlightColor()
    }

    override fun setShadowLayer(radius: Float, dx: Float, dy: Float, color: Int) {
        super.setShadowLayer(radius, dx, dy, color)
    }

    override fun getShadowRadius(): Float {
        return super.getShadowRadius()
    }

    override fun getShadowDx(): Float {
        return super.getShadowDx()
    }

    override fun getShadowDy(): Float {
        return super.getShadowDy()
    }

    override fun getShadowColor(): Int {
        return super.getShadowColor()
    }

    override fun getPaint(): TextPaint {
        return super.getPaint()
    }

    override fun getUrls(): Array<URLSpan> {
        return super.getUrls()
    }

    override fun setGravity(gravity: Int) {
        super.setGravity(gravity)
    }

    override fun getGravity(): Int {
        return super.getGravity()
    }

    override fun getPaintFlags(): Int {
        return super.getPaintFlags()
    }

    override fun setPaintFlags(flags: Int) {
        super.setPaintFlags(flags)
    }

    override fun setHorizontallyScrolling(whether: Boolean) {
        super.setHorizontallyScrolling(whether)
    }

    override fun setMinLines(minLines: Int) {
        super.setMinLines(minLines)
    }

    override fun getMinLines(): Int {
        return super.getMinLines()
    }

    override fun setMinHeight(minPixels: Int) {
        super.setMinHeight(minPixels)
    }

    override fun getMinHeight(): Int {
        return super.getMinHeight()
    }

    override fun setMaxLines(maxLines: Int) {
        super.setMaxLines(maxLines)
    }

    override fun getMaxLines(): Int {
        return super.getMaxLines()
    }

    override fun setMaxHeight(maxPixels: Int) {
        super.setMaxHeight(maxPixels)
    }

    override fun getMaxHeight(): Int {
        return super.getMaxHeight()
    }

    override fun setLines(lines: Int) {
        super.setLines(lines)
    }

    override fun setHeight(pixels: Int) {
        super.setHeight(pixels)
    }

    override fun setMinEms(minEms: Int) {
        super.setMinEms(minEms)
    }

    override fun getMinEms(): Int {
        return super.getMinEms()
    }

    override fun setMinWidth(minPixels: Int) {
        super.setMinWidth(minPixels)
    }

    override fun getMinWidth(): Int {
        return super.getMinWidth()
    }

    override fun setMaxEms(maxEms: Int) {
        super.setMaxEms(maxEms)
    }

    override fun getMaxEms(): Int {
        return super.getMaxEms()
    }

    override fun setMaxWidth(maxPixels: Int) {
        super.setMaxWidth(maxPixels)
    }

    override fun getMaxWidth(): Int {
        return super.getMaxWidth()
    }

    override fun setEms(ems: Int) {
        super.setEms(ems)
    }

    override fun setWidth(pixels: Int) {
        super.setWidth(pixels)
    }

    override fun setLineSpacing(add: Float, mult: Float) {
        super.setLineSpacing(add, mult)
    }

    override fun getLineSpacingMultiplier(): Float {
        return super.getLineSpacingMultiplier()
    }

    override fun getLineSpacingExtra(): Float {
        return super.getLineSpacingExtra()
    }

    override fun setLineHeight(lineHeight: Int) {
        super.setLineHeight(lineHeight)
    }

    override fun setLineHeight(unit: Int, lineHeight: Float) {
        super.setLineHeight(unit, lineHeight)
    }

    override fun setHighlights(highlights: Highlights?) {
        super.setHighlights(highlights)
    }

    override fun getHighlights(): Highlights? {
        return super.getHighlights()
    }

    override fun setSearchResultHighlights(vararg ranges: Int) {
        super.setSearchResultHighlights(*ranges)
    }

    override fun getSearchResultHighlights(): IntArray? {
        return super.getSearchResultHighlights()
    }

    override fun setFocusedSearchResultIndex(index: Int) {
        super.setFocusedSearchResultIndex(index)
    }

    override fun getFocusedSearchResultIndex(): Int {
        return super.getFocusedSearchResultIndex()
    }

    override fun setSearchResultHighlightColor(color: Int) {
        super.setSearchResultHighlightColor(color)
    }

    override fun getSearchResultHighlightColor(): Int {
        return super.getSearchResultHighlightColor()
    }

    override fun setFocusedSearchResultHighlightColor(color: Int) {
        super.setFocusedSearchResultHighlightColor(color)
    }

    override fun getFocusedSearchResultHighlightColor(): Int {
        return super.getFocusedSearchResultHighlightColor()
    }

    override fun append(text: CharSequence?, start: Int, end: Int) {
        super.append(text, start, end)
    }

    override fun setFreezesText(freezesText: Boolean) {
        super.setFreezesText(freezesText)
    }

    override fun getFreezesText(): Boolean {
        return super.getFreezesText()
    }

    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(text, type)
    }

    override fun getHint(): CharSequence {
        return super.getHint()
    }

    override fun isSingleLine(): Boolean {
        return super.isSingleLine()
    }

    override fun setInputType(type: Int) {
        super.setInputType(type)
    }

    override fun setRawInputType(type: Int) {
        super.setRawInputType(type)
    }

    override fun getInputType(): Int {
        return super.getInputType()
    }

    override fun setImeOptions(imeOptions: Int) {
        super.setImeOptions(imeOptions)
    }

    override fun getImeOptions(): Int {
        return super.getImeOptions()
    }

    override fun setImeActionLabel(label: CharSequence?, actionId: Int) {
        super.setImeActionLabel(label, actionId)
    }

    override fun getImeActionLabel(): CharSequence {
        return super.getImeActionLabel()
    }

    override fun getImeActionId(): Int {
        return super.getImeActionId()
    }

    override fun setOnEditorActionListener(l: OnEditorActionListener?) {
        super.setOnEditorActionListener(l)
    }

    override fun onEditorAction(actionCode: Int) {
        super.onEditorAction(actionCode)
    }

    override fun setPrivateImeOptions(type: String?) {
        super.setPrivateImeOptions(type)
    }

    override fun getPrivateImeOptions(): String {
        return super.getPrivateImeOptions()
    }

    override fun setInputExtras(xmlResId: Int) {
        super.setInputExtras(xmlResId)
    }

    override fun getInputExtras(create: Boolean): Bundle {
        return super.getInputExtras(create)
    }

    override fun setImeHintLocales(hintLocales: LocaleList?) {
        super.setImeHintLocales(hintLocales)
    }

    override fun getImeHintLocales(): LocaleList? {
        return super.getImeHintLocales()
    }

    override fun getError(): CharSequence {
        return super.getError()
    }

    override fun setError(error: CharSequence?) {
        super.setError(error)
    }

    override fun setError(error: CharSequence?, icon: Drawable?) {
        super.setError(error, icon)
    }

    override fun setFrame(l: Int, t: Int, r: Int, b: Int): Boolean {
        return super.setFrame(l, t, r, b)
    }

    override fun setFilters(filters: Array<out InputFilter>) {
        super.setFilters(filters)
    }

    override fun getFilters(): Array<InputFilter> {
        return super.getFilters()
    }

    override fun isTextSelectable(): Boolean {
        return super.isTextSelectable()
    }

    override fun setTextIsSelectable(selectable: Boolean) {
        super.setTextIsSelectable(selectable)
    }

    override fun getLineCount(): Int {
        return super.getLineCount()
    }

    override fun getLineBounds(line: Int, bounds: Rect?): Int {
        return super.getLineBounds(line, bounds)
    }

    override fun extractText(request: ExtractedTextRequest?, outText: ExtractedText?): Boolean {
        return super.extractText(request, outText)
    }

    override fun setExtractedText(text: ExtractedText?) {
        super.setExtractedText(text)
    }

    override fun onCommitCompletion(text: CompletionInfo?) {
        super.onCommitCompletion(text)
    }

    override fun onCommitCorrection(info: CorrectionInfo?) {
        super.onCommitCorrection(info)
    }

    override fun beginBatchEdit() {
        super.beginBatchEdit()
    }

    override fun endBatchEdit() {
        super.endBatchEdit()
    }

    override fun onBeginBatchEdit() {
        super.onBeginBatchEdit()
    }

    override fun onEndBatchEdit() {
        super.onEndBatchEdit()
    }

    override fun onPrivateIMECommand(action: String?, data: Bundle?): Boolean {
        return super.onPrivateIMECommand(action, data)
    }

    override fun setIncludeFontPadding(includepad: Boolean) {
        super.setIncludeFontPadding(includepad)
    }

    override fun getIncludeFontPadding(): Boolean {
        return super.getIncludeFontPadding()
    }

    override fun bringPointIntoView(offset: Int): Boolean {
        return super.bringPointIntoView(offset)
    }

    override fun bringPointIntoView(offset: Int, requestRectWithoutFocus: Boolean): Boolean {
        return super.bringPointIntoView(offset, requestRectWithoutFocus)
    }

    override fun moveCursorToVisibleOffset(): Boolean {
        return super.moveCursorToVisibleOffset()
    }

    override fun debug(depth: Int) {
        super.debug(depth)
    }

    override fun getSelectionStart(): Int {
        return super.getSelectionStart()
    }

    override fun getSelectionEnd(): Int {
        return super.getSelectionEnd()
    }

    override fun hasSelection(): Boolean {
        return super.hasSelection()
    }

    override fun setSingleLine() {
        super.setSingleLine()
    }

    override fun setSingleLine(singleLine: Boolean) {
        super.setSingleLine(singleLine)
    }

    override fun setAllCaps(allCaps: Boolean) {
        super.setAllCaps(allCaps)
    }

    override fun isAllCaps(): Boolean {
        return super.isAllCaps()
    }

    override fun setEllipsize(where: TextUtils.TruncateAt?) {
        super.setEllipsize(where)
    }

    override fun setMarqueeRepeatLimit(marqueeLimit: Int) {
        super.setMarqueeRepeatLimit(marqueeLimit)
    }

    override fun getMarqueeRepeatLimit(): Int {
        return super.getMarqueeRepeatLimit()
    }

    override fun getEllipsize(): TextUtils.TruncateAt {
        return super.getEllipsize()
    }

    override fun setSelectAllOnFocus(selectAllOnFocus: Boolean) {
        super.setSelectAllOnFocus(selectAllOnFocus)
    }

    override fun setCursorVisible(visible: Boolean) {
        super.setCursorVisible(visible)
    }

    override fun isCursorVisible(): Boolean {
        return super.isCursorVisible()
    }

    override fun onTextChanged(
        text: CharSequence?,
        start: Int,
        lengthBefore: Int,
        lengthAfter: Int
    ) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter)
    }

    override fun addTextChangedListener(watcher: TextWatcher?) {
        super.addTextChangedListener(watcher)
    }

    override fun removeTextChangedListener(watcher: TextWatcher?) {
        super.removeTextChangedListener(watcher)
    }

    override fun clearComposingText() {
        super.clearComposingText()
    }

    override fun didTouchFocusSelect(): Boolean {
        return super.didTouchFocusSelect()
    }

    override fun setScroller(s: Scroller?) {
        super.setScroller(s)
    }

    override fun isInputMethodTarget(): Boolean {
        return super.isInputMethodTarget()
    }

    override fun onTextContextMenuItem(id: Int): Boolean {
        return super.onTextContextMenuItem(id)
    }

    override fun isSuggestionsEnabled(): Boolean {
        return super.isSuggestionsEnabled()
    }

    override fun setCustomSelectionActionModeCallback(actionModeCallback: ActionMode.Callback?) {
        super.setCustomSelectionActionModeCallback(actionModeCallback)
    }

    override fun getCustomSelectionActionModeCallback(): ActionMode.Callback? {
        return super.getCustomSelectionActionModeCallback()
    }

    override fun setCustomInsertionActionModeCallback(actionModeCallback: ActionMode.Callback?) {
        super.setCustomInsertionActionModeCallback(actionModeCallback)
    }

    override fun getCustomInsertionActionModeCallback(): ActionMode.Callback {
        return super.getCustomInsertionActionModeCallback()
    }

    override fun setTextClassifier(textClassifier: TextClassifier?) {
        super.setTextClassifier(textClassifier)
    }

    override fun getTextClassifier(): TextClassifier {
        return super.getTextClassifier()
    }

    override fun getOffsetForPosition(x: Float, y: Float): Int {
        return super.getOffsetForPosition(x, y)
    }

    override fun getTextDirectionHeuristic(): TextDirectionHeuristic {
        return super.getTextDirectionHeuristic()
    }

    override fun setEmojiCompatEnabled(enabled: Boolean) {
        super.setEmojiCompatEnabled(enabled)
    }

    override fun isEmojiCompatEnabled(): Boolean {
        return super.isEmojiCompatEnabled()
    }

    override fun getTextMetricsParamsCompat(): PrecomputedTextCompat.Params {
        return super.getTextMetricsParamsCompat()
    }

    override fun setTextMetricsParamsCompat(params: PrecomputedTextCompat.Params) {
        super.setTextMetricsParamsCompat(params)
    }

    override fun setPrecomputedText(precomputed: PrecomputedTextCompat) {
        super.setPrecomputedText(precomputed)
    }

    override fun setTextFuture(future: Future<PrecomputedTextCompat>?) {
        super.setTextFuture(future)
    }

}