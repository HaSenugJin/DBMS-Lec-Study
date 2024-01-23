package controller;

import dao.BankDAO;

public class BankController {

    private BankDAO dao;

    public BankController(BankDAO dao) {
        this.dao = dao;
    }

    public void insert() {
        System.out.println("controller : insert");
        dao.insert("1234", 1000);
    }

    public void delete() {
        System.out.println("controller : delete");
        dao.deleteByNumber(1);
    }

    public void update() {
        System.out.println("controller : update");
        dao.updateByNumber(1000, 1);
    }

    public void selectOne() {
        System.out.println("controller : selectOne");
        dao.selectByNumber(1);
    }

    public void selectAll() {
        System.out.println("controller : selectAll");
        dao.selectAll();
    }
}