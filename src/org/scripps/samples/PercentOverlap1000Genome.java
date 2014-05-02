package org.scripps.samples;

import java.util.StringTokenizer;

import org.scripps.utils.CnvShowTable;

public class PercentOverlap1000Genome
{
	public static void main(String args[])
	{
		String s = "1000G_CNVnator962_15394~100~1~0.037422037422~0.0~0.227848101266~0.0~0.0"; // dataArray[i];
		String[] tokens = s.split("~"); //thousandGenGainVal.split("~");
		String myToken;
		String alleleFreq = "";
		for(int i=0; i< tokens.length; i++)
		{
			myToken = tokens[i];
			if(i == 1) {
				if(new Integer(myToken).intValue() > 80)
				{
					alleleFreq = tokens[3];
					System.out.println(alleleFreq); //check allele frequency against the condition Galina gives, if satisfied, 
																			//include dataArray into filteredArray
					/*if(allele freq condition satisfied)
						CnvShowTable.FilteredArray.add(TempArrayOne.get(i)); */
				}
				
			}
			
		}
	}

}
