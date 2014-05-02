package org.scripps.samples;

import java.util.StringTokenizer;

import org.scripps.utils.CnvShowTable;

public class PercentOverlapWellderly
{
	public static void main(String args[])
	{
		String s = "well14256~100~100~0.00497512437811"; // dataArray[i];
		String[] tokens = s.split("~");
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
