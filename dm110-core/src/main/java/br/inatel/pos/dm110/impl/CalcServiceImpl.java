package br.inatel.pos.dm110.impl;

import br.inatel.pos.dm110.api.CalcService;
import br.inatel.pos.dm110.api.Result;

public class CalcServiceImpl implements CalcService {

	@Override
	public Result sum(Float first, Float second) {
		
		Result result = new Result();
		result.setNum1(first);
		result.setNum2(second);
		result.setRetorno( String.valueOf( first + second) ) ;
		
		return result;
	}

	@Override
	public Result subtract(Float first, Float second) {
		
		Result result = new Result();
		result.setNum1(first);
		result.setNum2(second);
		result.setRetorno( String.valueOf( first - second ) );
		
		return result;
	}
	

}
