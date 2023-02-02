package observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 宠物类
 */
@Data
public abstract class Pet {
    /**
     * 物种
     */
    protected String species;
    /**
     * 名字
     */
    protected String name;
    /**
     * 食量
     */
    protected Integer appetite;
    /**
     * 是否醒来
     */
    protected boolean weakUp;
    /**
     * 观察者列表
     */
    protected List<PetObserver> observers = new ArrayList<>();

    abstract public void call();
}
