package cheesebaron.folding;


public class BaseFoldingLayout
	extends android.view.ViewGroup
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_addViewInLayout:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z:GetAddViewInLayout_Landroid_view_View_ILandroid_view_ViewGroup_LayoutParams_ZHandler\n" +
			"n_addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V:GetAddView_Landroid_view_View_ILandroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_dispatchDraw:(Landroid/graphics/Canvas;)V:GetDispatchDraw_Landroid_graphics_Canvas_Handler\n" +
			"";
		mono.android.Runtime.register ("Cheesebaron.Folding.BaseFoldingLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BaseFoldingLayout.class, __md_methods);
	}


	public BaseFoldingLayout (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == BaseFoldingLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.BaseFoldingLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public BaseFoldingLayout (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == BaseFoldingLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.BaseFoldingLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public BaseFoldingLayout (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == BaseFoldingLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.BaseFoldingLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public boolean addViewInLayout (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3)
	{
		return n_addViewInLayout (p0, p1, p2, p3);
	}

	private native boolean n_addViewInLayout (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3);


	public void addView (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2)
	{
		n_addView (p0, p1, p2);
	}

	private native void n_addView (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2);


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void dispatchDraw (android.graphics.Canvas p0)
	{
		n_dispatchDraw (p0);
	}

	private native void n_dispatchDraw (android.graphics.Canvas p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
