package meiyin.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import meiyin.domain.Picture;
import meiyin.mapper.PictureMapper;
import meiyin.mapper.ReportMapper;
import meiyin.service.AssetsService;
@Service
@Transactional
public class AssetsServiceImpl implements AssetsService {
	@Autowired
	private PictureMapper pictureMapper ;
	@Autowired
	private ReportMapper reportMapper;
	public String getPicUrl(Long id){
		Picture picture = pictureMapper.selectByPrimaryKey(id);
		String uri = picture.getUri();
		return uri;
		
	}
	public String getVoiceUrl(Long id) {
		Map<String, Object> voice = reportMapper.getVoice(id);
		 String string = voice.get("uri").toString();
		return string;
	}
}
