//=======================================================================
// ARCHIVO DivisionAttribute.java
// FECHA CREACIÓN: 2012/09/13
//=======================================================================
package co.zero.hcm.enumeration;

import co.zero.common.enumeration.IEntityAttribute;
import co.zero.hcm.dto.DivisionDTO;

/**
 * Enumeración que reune los nombres de los atributos de un {@link DivisionDTO},
 * para permitir un tratamiento dinámico a los atributos fijos
 * @author Hernán Tenjo
 * @version 1.0
 */
public enum DivisionAttribute implements IEntityAttribute{
	NAME(){
		/*
		 * (non-Javadoc)
		 * @see co.zero.common.enumeration.IEntityAttribute#isRequired()
		 */
        @Override
		public boolean isRequired(){
			return true;
		}
		
		/*
		 * (non-Javadoc)
		 * @see co.zero.common.enumeration.IEntityAttribute#getPriority()
		 */
        @Override
		public int getPriority(){
			return 1;
		}
		
		/*
		 * (non-Javadoc)
		 * @see co.zero.common.enumeration.IEntityAttribute#getIndex()
		 */
		@Override
		public int getIndex() {
			return 0;
		}
	},
	
	PARENT(){
		/*
		 * (non-Javadoc)
		 * @see co.zero.common.enumeration.IEntityAttribute#isRequired()
		 */
        @Override
		public boolean isRequired(){
			return false;
		}
		
		/*
		 * (non-Javadoc)
		 * @see co.zero.common.enumeration.IEntityAttribute#getPriority()
		 */
        @Override
		public int getPriority(){
			return 2;
		}
		
		/*
		 * (non-Javadoc)
		 * @see co.zero.common.enumeration.IEntityAttribute#getIndex()
		 */
		@Override
		public int getIndex() {
			return 1;
		}
	};

	/* (non-Javadoc)
	 * @see co.zero.common.enumeration.IEntityAttribute#getEntityName()
	 */
	@Override
	public String getEntityName() {
		return getEntity().getName();
	}
	
	/* (non-Javadoc)
	 * @see co.zero.common.enumeration.IEntityAttribute#getEntitySimpleName()
	 */
	@Override
	public String getEntitySimpleName() {
		return getEntity().getSimpleName();
	}
	
	/* (non-Javadoc)
	 * @see co.zero.common.enumeration.IEntityAttribute#getEntity()
	 */
	@Override
	public Class<?> getEntity() {
		return DivisionDTO.class;
	}
	
	/* (non-Javadoc)
	 * @see co.zero.common.enumeration.IEntityAttribute#getAttributeName()
	 */
	@Override
	public String getAttributeName() {
		return this.toString();
	}

	/* (non-Javadoc)
	 * @see co.zero.common.enumeration.IEntityAttribute#getByIndex()
	 */
	@Override
	public IEntityAttribute getByIndex(int index) {
		IEntityAttribute[] attributes = DivisionAttribute.values();
		
		for(IEntityAttribute attribute : attributes){
			if(attribute.getIndex() == index){
				return attribute;
			}
		}
		
		return null;
	}
	
	/* (non-Javadoc)
	 * @see co.zero.common.enumeration.IEntityAttribute#hasOptions()
	 */
	@Override
	public boolean hasOptions() {
		return false;
	}

	/* (non-Javadoc)
	 * @see co.zero.common.enumeration.IEntityAttribute#getOptions()
	 */
	@Override
	public Object[] getOptions() {
		return null;
	}
}