package com.htic.suricata.spreadsheet.model.creation;

import com.htic.arq.core.pool.Pool;
import com.htic.suricata.spreadsheet.model.TestSourceSpreadSheet;
import com.htic.suricata.spreadsheet.model.TestSourceSpreadSheetParameters;

public class TestSourceSpreadSheetPool extends Pool<TestSourceSpreadSheet>{

	private static TestSourceSpreadSheetPool instance = null;


	protected TestSourceSpreadSheetPool() {
		super();
	}
	protected TestSourceSpreadSheetPool(long expirationTime) {
		super(expirationTime);
	}


	public static TestSourceSpreadSheetPool getInstance(){
		if(instance == null)
			instance = new TestSourceSpreadSheetPool();
		return instance;
	}


	@Override
	protected TestSourceSpreadSheet createInstance() {
		return new TestSourceSpreadSheet(new TestSourceSpreadSheetParameters(""));
	}

	@Override
	public boolean validateInstance(TestSourceSpreadSheet o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void expireInstance(TestSourceSpreadSheet o) {
		// TODO Auto-generated method stub
	}

}