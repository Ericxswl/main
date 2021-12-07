using Android.App;
using Android.OS;
using Android.Runtime;
using Com.Baidu.Mapapi.Map;
using Com.Baidu.Mapapi;
using Android.Support.V7.App;

namespace BaiDuDemo
{
    [Activity(Label = "@string/app_name", Theme = "@style/AppTheme", MainLauncher = true)]
    public class MainActivity: AppCompatActivity  
    {
        private MapView nmapView = null;
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            // Set our view from the "main" layout resource
            SDKInitializer.Initialize(ApplicationContext);
            SetContentView(Resource.Layout.activity_main);
            nmapView = FindViewById<MapView>(Resource.Id.mapView);
        }
        public override void OnRequestPermissionsResult(int requestCode, string[] permissions, [GeneratedEnum] Android.Content.PM.Permission[] grantResults)
        {
            Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);

            base.OnRequestPermissionsResult(requestCode, permissions, grantResults);
        }
        protected override void OnDestroy()
        {
            base.OnDestroy();
            nmapView.OnDestroy();
        }
        protected override void OnResume()
        {
            base.OnResume();
            nmapView.OnResume();
        }
        protected override void OnPause()
        {
            base.OnPause();
            nmapView.OnPause();
        }
    }
}