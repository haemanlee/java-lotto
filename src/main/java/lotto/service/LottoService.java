package lotto.service;

import lotto.domain.Lotto;
import lotto.dto.Amount;
import lotto.dto.ManualLottoNumbers;
import lotto.dto.WinningNumber;
import lotto.dto.WinningStatistic;
import lotto.service.helper.LottoFactory;
import lotto.service.helper.WinningChecker;

import java.util.Collection;
import java.util.List;

public class LottoService {
    public List<Lotto> buyLottos(ManualLottoNumbers manualLottoNumbers, Amount amount) {
        return LottoFactory.buyLottos(manualLottoNumbers, amount);
    }

    public WinningStatistic getResult(WinningNumber winningNumber, Collection<Lotto> boughtLottos) {
        return WinningChecker.getResult(winningNumber, boughtLottos);
    }
}
