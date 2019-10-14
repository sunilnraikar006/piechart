package com.sgs.chartassets.interfaces;


import com.sgs.chartassets.components.YAxis;
import com.sgs.chartassets.data.BarLineScatterCandleBubbleData;
import com.sgs.chartassets.utils.ChartInterface;
import com.sgs.chartassets.utils.Transformer;


public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(YAxis.AxisDependency axis);
    boolean isInverted(YAxis.AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
