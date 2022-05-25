package com.idat.Service;

import java.util.List;


import com.idat.Model.Items;

public interface ItemService {
	void guardarItem(Items items);
	void actualizarItem(Items items);
	void eliminarItem(Integer id);
	List<Items> listarItems();
	Items obtenerItemsId(Integer id);

}
