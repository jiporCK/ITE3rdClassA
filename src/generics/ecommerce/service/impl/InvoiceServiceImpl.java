package generics.ecommerce.service.impl;

import generics.ecommerce.model.Invoice;
import generics.ecommerce.service.InvoiceService;

import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public Invoice create(Invoice invoice) {
        return null;
    }

    @Override
    public void updateById(Long aLong, Invoice invoice) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Invoice> getAll() {
        return List.of();
    }

    @Override
    public Invoice getById(Long aLong) {
        return null;
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }
}
