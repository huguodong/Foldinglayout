package cheesebaron.folding;


public class FoldingDrawerLayout
	extends android.support.v4.widget.DrawerLayout
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_closeDrawer:(Landroid/view/View;)V:GetCloseDrawer_Landroid_view_View_Handler\n" +
			"n_generateLayoutParams:(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;:GetGenerateLayoutParams_Landroid_util_AttributeSet_Handler\n" +
			"";
		mono.android.Runtime.register ("Cheesebaron.Folding.FoldingDrawerLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FoldingDrawerLayout.class, __md_methods);
	}


	public FoldingDrawerLayout (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == FoldingDrawerLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.FoldingDrawerLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public FoldingDrawerLayout (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == FoldingDrawerLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.FoldingDrawerLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public FoldingDrawerLayout (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == FoldingDrawerLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.FoldingDrawerLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void closeDrawer (android.view.View p0)
	{
		n_closeDrawer (p0);
	}

	private native void n_closeDrawer (android.view.View p0);


	public android.view.ViewGroup.LayoutParams generateLayoutParams (android.util.AttributeSet p0)
	{
		return n_generateLayoutParams (p0);
	}

	private native android.view.ViewGroup.LayoutParams n_generateLayoutParams (android.util.AttributeSet p0);

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
