package mono.com.baidu.mapapi.map;


public class BaiduMap_OnMarkerClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMarkerClick:(Lcom/baidu/mapapi/map/Marker;)Z:GetOnMarkerClick_Lcom_baidu_mapapi_map_Marker_Handler:Com.Baidu.Mapapi.Map.BaiduMap/IOnMarkerClickListenerInvoker, XamarinBaiDuMapSDKBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Baidu.Mapapi.Map.BaiduMap+IOnMarkerClickListenerImplementor, XamarinBaiDuMapSDKBinding", BaiduMap_OnMarkerClickListenerImplementor.class, __md_methods);
	}


	public BaiduMap_OnMarkerClickListenerImplementor ()
	{
		super ();
		if (getClass () == BaiduMap_OnMarkerClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Baidu.Mapapi.Map.BaiduMap+IOnMarkerClickListenerImplementor, XamarinBaiDuMapSDKBinding", "", this, new java.lang.Object[] {  });
	}


	public boolean onMarkerClick (com.baidu.mapapi.map.Marker p0)
	{
		return n_onMarkerClick (p0);
	}

	private native boolean n_onMarkerClick (com.baidu.mapapi.map.Marker p0);

	private java.util.ArrayList refList;
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
