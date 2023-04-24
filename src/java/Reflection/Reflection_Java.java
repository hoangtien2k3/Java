package src.java.Reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Valid {  // annotation Valid
}

class NhanVien {
    @Valid
    private int tuoi;

    @Valid
    private double luong;

    @Valid
    private String diaChiEmail;

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getDiaChiEmail() {
        return diaChiEmail;
    }

    public void setDiaChiEmail(String diaChiEmail) {
        this.diaChiEmail = diaChiEmail;
    }
}

public class Reflection_Java {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.setTuoi(-5);
        nv.setLuong(1000);
        nv.setDiaChiEmail("abc@xyz.com");

        Class<?> clazz = nv.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Valid) {
                    // kiểm tra hợp lệ cho trường field
                    String fieldName = field.getName();
                    Object fieldValue = null;
                    try {
                        Method getter = clazz.getMethod("get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1));
                        fieldValue = getter.invoke(nv);
                        if (field.getType() == int.class && (int) fieldValue <= 0) {
                            System.out.println(fieldName + " không hợp lệ");
                        } else if (field.getType() == double.class && (double) fieldValue <= 0) {
                            System.out.println(fieldName + " không hợp lệ");
                        } else if (field.getType() == String.class && ((String) fieldValue).isEmpty()) {
                            System.out.println(fieldName + " không hợp lệ");
                        }
                    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
