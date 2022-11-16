package id.mareno.belajarspringdasar.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Samuel Mareno
 * @Date 21/04/22
 */
@Data
@AllArgsConstructor
public class CyclicB {

    private CyclicC cyclicC;
}
