package meiyin.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import meiyin.service.AssetsService;

@Controller
public class AssetsController {
	@Autowired
	private AssetsService assetsService;

	@RequestMapping(value = "/h5page/view", method = RequestMethod.GET)
	public String h5pageView(String page) {
		return "index01";
	}
	@RequestMapping(value = "/h5page/notice", method = RequestMethod.GET)
	public String h5pageNotice(String page) {
		return "index02";
	}


	@RequestMapping(value = "/image/view", method = RequestMethod.GET)
	public void imageView(String id, HttpServletRequest request,
			HttpServletResponse response) {
		long Longid = Long.parseLong(id);
		String picUrl = assetsService.getPicUrl(Longid);
		String path = request.getServletContext().getRealPath("/picture");
		try {
			
			InputStream reader = new FileInputStream(path + "/" + picUrl);
			byte[] bytes = new byte[1024];
			int len;
			while ((len = reader.read(bytes)) > 0) {
				response.getOutputStream().write(bytes, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping(value = "/voice", method = RequestMethod.GET)
	public void voice(String voice_id, HttpServletRequest request,
			HttpServletResponse response) {
		long Longid = Long.parseLong(voice_id);
		String picUrl = assetsService.getVoiceUrl(Longid);
		String path = request.getServletContext().getRealPath("/voice");
		try {
			
			InputStream reader = new FileInputStream(path + "/" + picUrl);
			byte[] bytes = new byte[1024];
			int len;
			while ((len = reader.read(bytes)) > 0) {
				response.getOutputStream().write(bytes, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
