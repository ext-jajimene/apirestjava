package com.apirestlettersandbuses.apirest.domain.ports;

import com.apirestlettersandbuses.apirest.domain.dto.ChainText;

import java.util.List;

public interface ChainPort {

   List<ChainText> getWords();
}
