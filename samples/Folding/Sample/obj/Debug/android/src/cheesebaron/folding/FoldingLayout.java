package cheesebaron.folding;


public class FoldingLayout
	extends cheesebaron.folding.BaseFoldingLayout
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_addViewInLayout:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z:GetAddViewInLayout_Landroid_view_View_ILandroid_view_ViewGroup_LayoutParams_ZHandler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Cheesebaron.Folding.FoldingLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FoldingLayout.class, __md_methods);
	}


	public FoldingLayout (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == FoldingLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.FoldingLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public FoldingLayout (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == FoldingLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.FoldingLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public FoldingLayout (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == FoldingLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.FoldingLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public boolean addViewInLayout (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3)
	{
		return n_addViewInLayout (p0, p1, p2, p3);
	}

	private native boolean n_addViewInLayout (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);

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
