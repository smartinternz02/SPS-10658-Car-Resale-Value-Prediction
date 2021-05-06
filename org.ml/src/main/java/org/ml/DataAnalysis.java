package org.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;
import tech.tablesaw.plotly.traces.ScatterTrace;

public class DataAnalysis {
public static void main(String args[]){

		System.out.println("data analytics");
		try {
		Table resale_data=Table.read().csv("E:\\oracleProject\\train1_data.csv");
		System.out.println(resale_data.shape());
		System.out.println(resale_data.structure());
		System.out.println(resale_data.summary());
		Layout l1=Layout.builder().title("Car Resale").build();
		//box-plot
		BoxTrace t1=BoxTrace.builder(resale_data.categoricalColumn("Power"), resale_data.nCol("Year")).build();
		//histogram
		HistogramTrace t2=HistogramTrace.builder(resale_data.categoricalColumn("Kilometers_Driven"), resale_data.nCol("Year")).build();
		Plot.show(new Figure(l1,t1));
		Plot.show(new Figure(l1,t2));
		//scatter-plot
		ScatterTrace s=ScatterTrace.builder(resale_data.nCol("Seats"),resale_data.nCol("Year")).build();
		Plot.show(new Figure(l1,s));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}