package src.jsfcompslib.transferobject;

import java.util.ArrayList;
import java.util.List;

import src.entity.Oferta;


public class OfertaViewTO extends EntityViewTransferObject {
	
	public static OfertaViewTO getNewOfertaViewTO(Oferta oferta) {
		
		OfertaViewTO to = new OfertaViewTO();
		
		to.setOfid(oferta.getId().toString());
		
		to.setTexttop(oferta.getName());
		to.setTextcenter(oferta.getDescripcion());
		to.setTextbottom(oferta.getArticulo().getName());
		
		to.setTextobotonenviar("compra");
		to.setUrlimage(oferta.getUrlImage());
	
		
		return to;
	}
	
	public static List<OfertaViewTO> getList(List<Oferta> listaofertas){
		List<OfertaViewTO> listaRespuesta = new ArrayList<OfertaViewTO>();
		for(Oferta oferta : listaofertas) {
			listaRespuesta.add(OfertaViewTO.getNewOfertaViewTO(oferta));
		}
		return listaRespuesta;
	}
	


}
