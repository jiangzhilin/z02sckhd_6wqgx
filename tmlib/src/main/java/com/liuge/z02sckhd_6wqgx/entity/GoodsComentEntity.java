package com.liuge.z02sckhd_6wqgx.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/9/18.
 */

public class GoodsComentEntity {

    /**
     * msg : 获取成功
     * data : {"result":[{"images":null,"Score":5,"user_id":3,"head_pic":null,"goods_id":523,"comment":null,"member_name":"157****6882","add_time":"1970-01-01"}],"totalpage":1}
     * status : success
     */

    private String msg;
    private DataBean data;
    private String status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * result : [{"images":null,"Score":5,"user_id":3,"head_pic":null,"goods_id":523,"comment":null,"member_name":"157****6882","add_time":"1970-01-01"}]
         * totalpage : 1
         */

        private int totalpage;
        private List<ResultBean> result;

        public int getTotalpage() {
            return totalpage;
        }

        public void setTotalpage(int totalpage) {
            this.totalpage = totalpage;
        }

        public List<ResultBean> getResult() {
            return result;
        }

        public void setResult(List<ResultBean> result) {
            this.result = result;
        }

        public class imgBean{

            /**
             * path : http://shop.dktoo.com/application/z02sckhd_6wqgx/uploads/goods/20181024/2f58ef0e2d1e11e5876ef19c76948973.jpeg
             * id : 1064
             */

            private String path;
            private String id;

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }

        public static class ResultBean {
            /**
             * images : null
             * Score : 5
             * user_id : 3
             * head_pic : null
             * goods_id : 523
             * comment : null
             * member_name : 157****6882
             * add_time : 1970-01-01
             */

            private List<imgBean> images;
            private int Score;
            private int user_id;
            private String head_pic;
            private int goods_id;
            private String comment;
            private String member_name;
            private String add_time;

            public List<imgBean> getImages() {
                return images;
            }

            public void setImages(List<imgBean> images) {
                this.images = images;
            }

            public int getScore() {
                return Score;
            }

            public void setScore(int Score) {
                this.Score = Score;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getHead_pic() {
                return head_pic;
            }

            public void setHead_pic(String head_pic) {
                this.head_pic = head_pic;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }

            public String getMember_name() {
                return member_name;
            }

            public void setMember_name(String member_name) {
                this.member_name = member_name;
            }

            public String getAdd_time() {
                return add_time;
            }

            public void setAdd_time(String add_time) {
                this.add_time = add_time;
            }
        }
    }
}
