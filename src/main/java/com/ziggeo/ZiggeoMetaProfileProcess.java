package com.ziggeo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class ZiggeoMetaProfileProcess {

    private Ziggeo application;

    public ZiggeoMetaProfileProcess(Ziggeo application) {
        this.application = application;
    }

    public JSONArray index(String meta_token_or_key) throws IOException, JSONException {
        return this.application.connect().getJSONArray("/v1/metaprofiles/" + meta_token_or_key + "/process", null);
    }

    public JSONObject get(String meta_token_or_key, String token_or_key) throws IOException, JSONException {
        return this.application.connect().getJSON("/v1/metaprofiles/" + meta_token_or_key + "/process/" + token_or_key + "", null);
    }

    public InputStream delete(String meta_token_or_key, String token_or_key) throws IOException, JSONException {
        return this.application.connect().delete("/v1/metaprofiles/" + meta_token_or_key + "/process/" + token_or_key + "", null);
    }

    public JSONObject create_video_analysis_process(String meta_token_or_key) throws IOException, JSONException {
        return this.application.connect().postJSON("/v1/metaprofiles/" + meta_token_or_key + "/process/analysis", null, null);
    }

    public JSONObject create_audio_transcription_process(String meta_token_or_key) throws IOException, JSONException {
        return this.application.connect().postJSON("/v1/metaprofiles/" + meta_token_or_key + "/process/transcription", null, null);
    }

    public JSONObject create_nsfw_process(String meta_token_or_key, JSONObject data) throws IOException, JSONException {
        return this.application.connect().postJSON("/v1/metaprofiles/" + meta_token_or_key + "/process/nsfw", data, null);
    }

}

