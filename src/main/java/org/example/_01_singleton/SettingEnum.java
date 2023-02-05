package org.example._01_singleton;

// 미리 만들어진다
// enum은 Serializable을 구현함
// 띠라서 직렬화 역직렬가 된다. 싱글톤이 유지됨
public enum SettingEnum {
    INSTANCE;

    private Integer number;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
