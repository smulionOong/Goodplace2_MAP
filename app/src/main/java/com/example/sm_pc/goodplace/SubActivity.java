package com.example.sm_pc.goodplace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;


public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        MapView mapView = new MapView(this);
        mapView.setDaumMapApiKey("34a24b65c831bb88692b4c33c35b5431");
        RelativeLayout container = (RelativeLayout) findViewById(R.id.map_view);
        container.addView(mapView);

//        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
//        MapPoint mapPoint = MapPoint.mapPointWithGeoCoord(37.5514579595, 126.951949155);
//        mapView.setMapCenterPoint(mapPoint, true);
//        //true면 앱 실행 시 애니메이션 효과가 나오고 false면 애니메이션이 나오지않음.
//        mapViewContainer.addView(mapView);
//
//        MapPOIItem marker = new MapPOIItem();
//        marker.setItemName("한세사이버보안고등학교");
//        marker.setTag(0);
//        marker.setMapPoint(mapPoint);
//        // 기본으로 제공하는 BluePin 마커 모양.
//        marker.setMarkerType(MapPOIItem.MarkerType.BluePin);
//        // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
//        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin);
//        mapView.addPOIItem(marker);
    }
}