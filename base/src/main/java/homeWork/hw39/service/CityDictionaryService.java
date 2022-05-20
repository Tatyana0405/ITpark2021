package homeWork.hw39.service;

import homeWork.hw39.dto.CityDto;

import java.util.Optional;
import java.util.Set;

public interface CityDictionaryService {
    Set<CityDto> getCities();
    Optional<CityDto> getCityByCode(String code);
}
