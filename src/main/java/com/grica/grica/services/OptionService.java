package com.grica.grica.services;

import com.grica.grica.entities.Option;

import java.util.List;

public interface OptionService
{
    Option addNewOption(Option option);

    Option updateNewOption( Option option);

    List<Option> getAllOption( );

    Option getOptionParId( Long id);

    void deleteOptionParId(Long id);
}
