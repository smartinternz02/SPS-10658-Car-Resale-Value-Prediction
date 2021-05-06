package org.ml;


import java.util.Arrays;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Lregression {
	public static void main(String[] args) throws Exception {
		DataSource src=new DataSource("C:\\Users\\Lohitha.Gattu\\eclipse-new-workspace\\org.ml\\src\\main\\java\\org\\ml\\train1_data.arff");		
		Instances ds=src.getDataSet();
		ds.setClassIndex(ds.numAttributes()-1);
		LinearRegression lr=new LinearRegression();
		lr.buildClassifier(ds);
		Evaluation lr_eval=new Evaluation(ds);
		lr_eval.evaluateModel(lr, ds);
		System.out.println(lr_eval.toSummaryString());
		
		
	}

}