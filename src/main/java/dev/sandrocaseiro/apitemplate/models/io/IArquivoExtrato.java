package dev.sandrocaseiro.apitemplate.models.io;

import dev.sandrocaseiro.apitemplate.utils.JsonUtil;
import lombok.Data;

import java.util.List;

@Data
public class IArquivoExtrato {
	private IArquivoExtratoHeader header;

	private List<IArquivoExtratoLote> lotes;

	private IArquivoExtratoTrailer trailer;

	@Override
	public String toString() {
		return JsonUtil.serializePrettyPrint(this);
	}
}