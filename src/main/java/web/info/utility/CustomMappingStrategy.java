package web.info.utility;

import com.opencsv.bean.BeanField;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvBindByName;

import java.util.stream.IntStream;

public class CustomMappingStrategy<T> extends ColumnPositionMappingStrategy<T> {
    @Override
    public String[] generateHeader(T bean) {
        final int numColumns = getFieldMap().values().size();

        String[] header = new String[numColumns];
        super.setColumnMapping(header);

        header = IntStream.range(0, numColumns)
                .mapToObj(this::findField)
                .map(BeanField::getField)
                .map(field -> field.getDeclaredAnnotation(CsvBindByName.class))
                .map(CsvBindByName::column)
                .toArray(String[]::new);

        return header;
    }
}
