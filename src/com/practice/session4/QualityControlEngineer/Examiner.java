package com.practice.session4.QualityControlEngineer;

import com.practice.session4.QualityControlEngineer.Exception.ColorTransparencyException;
import com.practice.session4.QualityControlEngineer.Exception.PressureToleranceException;
import com.practice.session4.QualityControlEngineer.Exception.SizeException;

import java.util.ArrayList;
import java.util.List;

public class Examiner {
    public List<String> checkProductList(List<Product> products) {
        List<String> result = new ArrayList<>();
        for (Product product : products) {
            try {
                checkProduct(product);
            } catch (SizeException e) {
                result.add(product.getId() + "-1");
            } catch (PressureToleranceException e) {
                result.add(product.getId() + "-2");
            } catch (ColorTransparencyException e) {
                result.add(product.getId() + "-3");
            }
        }
        return result;
    }

    private void checkProduct(Product p) throws SizeException, PressureToleranceException, ColorTransparencyException {
        if (p.getSize() != 70) {
            throw new SizeException("Size Exception");
        }
        if (p.getPressureTolerance() < 1000) {
            throw new PressureToleranceException("Pressure Tolerance Exception");
        }
        if (p.getColorTransparency() < 235 || p.getColorTransparency() > 245) {
            throw new ColorTransparencyException("Color Transparency Exception");
        }
    }
}
