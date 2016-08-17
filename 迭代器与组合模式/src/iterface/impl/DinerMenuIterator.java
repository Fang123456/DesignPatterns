package iterface.impl;

import item.MenuItem;
import com.sun.xml.internal.txw2.IllegalSignatureException;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class DinerMenuIterator implements Iterator {
    int position = 0;
    MenuItem[] items;

    public DinerMenuIterator( MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalSignatureException("You can't remove ");
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}


