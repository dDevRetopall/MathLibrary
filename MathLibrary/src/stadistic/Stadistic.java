/*******************************************************************************
 * Copyright (C) 2018-2019 Retopall Services
 * For more information please check www.retopall.com
 * RetopMathUtils can not be copied and/or distributed without the express
 * permission of dDev Tech
 ******************************************************************************/

package stadistic;

import java.util.ArrayList;

public class Stadistic {
	//Will collect only Y data
	public static double getMean(Dataset data) {
		ArrayList<Data>dataset=data.getDataset();
		double sum=0;
		for(int i=0;i<dataset.size();i++) {
			sum+=dataset.get(i).getY();
		}
		return sum/dataset.size();
	}
	public static double getStandardDeviation(Dataset data) {
		ArrayList<Data>dataset=data.getDataset();
		double mean=getMean(data);
		double sum=0;
		for(int i=0;i<dataset.size();i++) {
			sum+=Math.pow(dataset.get(i).getY()-mean, 2);
		}
		return Math.sqrt((1/(dataset.size()-1))*sum);
	}
}
