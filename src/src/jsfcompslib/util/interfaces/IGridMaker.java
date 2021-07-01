package src.jsfcompslib.util.interfaces;

import java.util.List;

import src.jsfcompslib.transferobject.OfertaViewTO;


public interface IGridMaker {
	
	public void setCols(Integer cols);
	public Integer getCols();
	public List<OfertaViewTO> getList();
	public void setList(List<OfertaViewTO> list);

}
