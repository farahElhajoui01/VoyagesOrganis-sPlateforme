package com.voyageOrganise.provide.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.TypeExtra;
import com.voyageOrganise.provide.vo.TypeExtraVo;
import com.voyageOrganise.service.util.ListUtil;
import com.voyageOrganise.service.util.StringUtil;

@Component
public class TypeExtraConverter extends AbstractConverter<TypeExtra,TypeExtraVo>{

	
    private boolean extras; 

    @Autowired
    private ExtrasConverter extraConverter;
	
	@Override
	public TypeExtra toBean(TypeExtraVo vo) {
		
		 TypeExtra typeExtra=new TypeExtra();
		 
	        if (StringUtil.isNotEmpty(vo.getLibelle())){
	        	typeExtra.setLibelle(vo.getLibelle());
	        }
	        if (StringUtil.isNotEmpty(vo.getId())){
	        	typeExtra.setId(StringUtil.toLong(vo.getId()));
	        }
	        if (StringUtil.isNotEmpty(vo.getTarif())){
	        	typeExtra.setTarif(StringUtil.toDouble(vo.getTarif()));
	        }
	        if (extras  && ListUtil.isNotEmpty(vo.getExtrasVo())){
	        	typeExtra.setExtras(extraConverter.toBean(vo.getExtrasVo()));
            }
	        return typeExtra;
	}

	@Override
	public TypeExtraVo toVo(TypeExtra bean) {
		
		 TypeExtraVo typeExtraVo=new TypeExtraVo();
		 
	        if (StringUtil.isNotEmpty(bean.getLibelle())){
	        	typeExtraVo.setLibelle(bean.getLibelle());
	        }
	        if (bean.getId()!=null){
	        	typeExtraVo.setId(StringUtil.toString(bean.getId()));
	        }
	        if (bean.getTarif()+""!=null){
	        	typeExtraVo.setTarif(StringUtil.toString(bean.getTarif()));
	        }
	        if (extras  && ListUtil.isNotEmpty(bean.getExtras())){
	        	typeExtraVo.setExtrasVo(extraConverter.toVo(bean.getExtras()));
         }
	        return typeExtraVo;
	}

	public boolean isExtras() {
		return extras;
	}

	public void setExtras(boolean extras) {
		this.extras = extras;
	}


	
	
}
