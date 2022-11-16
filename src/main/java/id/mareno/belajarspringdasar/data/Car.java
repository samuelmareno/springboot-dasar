package id.mareno.belajarspringdasar.data;

import id.mareno.belajarspringdasar.aware.IdAware;
import lombok.Getter;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
public class Car implements IdAware {

    @Getter
    public String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
