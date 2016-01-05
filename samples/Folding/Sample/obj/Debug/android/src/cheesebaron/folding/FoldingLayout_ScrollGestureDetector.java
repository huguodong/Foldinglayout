package cheesebaron.folding;


public class FoldingLayout_ScrollGestureDetector
	extends android.view.GestureDetector.SimpleOnGestureListener
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onDown:(Landroid/view/MotionEvent;)Z:GetOnDown_Landroid_view_MotionEvent_Handler\n" +
			"n_onScroll:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z:GetOnScroll_Landroid_view_MotionEvent_Landroid_view_MotionEvent_FFHandler\n" +
			"";
		mono.android.Runtime.register ("Cheesebaron.Folding.FoldingLayout/ScrollGestureDetector, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FoldingLayout_ScrollGestureDetector.class, __md_methods);
	}


	public FoldingLayout_ScrollGestureDetector () throws java.lang.Throwable
	{
		super ();
		if (getClass () == FoldingLayout_ScrollGestureDetector.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.FoldingLayout/ScrollGestureDetector, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public FoldingLayout_ScrollGestureDetector (cheesebaron.folding.FoldingLayout p0, int p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == FoldingLayout_ScrollGestureDetector.class)
			mono.android.TypeManager.Activate ("Cheesebaron.Folding.FoldingLayout/ScrollGestureDetector, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Cheesebaron.Folding.FoldingLayout, Cheesebaron.Folding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean onDown (android.view.MotionEvent p0)
	{
		return n_onDown (p0);
	}

	private native boolean n_onDown (android.view.MotionEvent p0);


	public boolean onScroll (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3)
	{
		return n_onScroll (p0, p1, p2, p3);
	}

	private native boolean n_onScroll (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);

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
