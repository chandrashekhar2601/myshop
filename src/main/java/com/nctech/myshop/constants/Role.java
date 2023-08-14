package com.nctech.myshop.constants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Role {
    ADMIN(1, "Admin"), EMPLOYEE(2, "Employee"), CUSTOMER(3, "Customer");

    private Integer id;
    private String value;

    Role(Integer id, String value) {
        this.id = id;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    private static Map<Integer, String> roleIDMap = new HashMap<>();
    private static Map<String, Integer> roleValueMap = new HashMap<>();

    static {
        roleIDMap.put(ADMIN.getId(), ADMIN.getValue());
        roleIDMap.put(EMPLOYEE.getId(), EMPLOYEE.getValue());
        roleIDMap.put(CUSTOMER.getId(), CUSTOMER.getValue());

        roleValueMap.put(ADMIN.getValue(), ADMIN.getId());
        roleValueMap.put(EMPLOYEE.getValue(), EMPLOYEE.getId());
        roleValueMap.put(CUSTOMER.getValue(), CUSTOMER.getId());
    }

    public static List<Role> all() {
        return Stream.of(Role.values()).collect(Collectors.toList());
    }

    public static String findById(Integer id) {
        return roleIDMap.get(id);
    }

    public static Integer findByName(String name) {
        return roleValueMap.get(name);
    }
}
