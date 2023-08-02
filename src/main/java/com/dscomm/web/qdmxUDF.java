package com.dscomm.web;

import com.google.auto.service.AutoService;
import org.apache.seatunnel.api.table.type.BasicType;
import org.apache.seatunnel.api.table.type.SeaTunnelDataType;
import org.apache.seatunnel.transform.sql.zeta.ZetaUDF;

import java.util.List;

@AutoService(ZetaUDF.class)
public class qdmxUDF implements ZetaUDF {

    @Override
    public String functionName() {
        return "qdmx";
    }

    @Override
    public SeaTunnelDataType<?> resultType(List<SeaTunnelDataType<?>> list) {
        return BasicType.STRING_TYPE;
    }

    @Override
    public Object evaluate(List<Object> list) {
        String str = list.get(0).toString();
        return "b:"+list.get(0).toString();
    }

}