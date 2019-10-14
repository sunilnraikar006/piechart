package com.sgs.chartassets.interfaces;


import com.sgs.chartassets.components.YAxis;
import com.sgs.chartassets.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
