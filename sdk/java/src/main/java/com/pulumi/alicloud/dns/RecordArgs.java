// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordArgs Empty = new RecordArgs();

    /**
     * Host record for the domain record. This host_record can have at most 253 characters, and each part split with &#34;.&#34; can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;*&#34;,&#34;@&#34;,  and must not begin or end with &#34;-&#34;.
     * 
     */
    @Import(name="hostRecord", required=true)
    private Output<String> hostRecord;

    /**
     * @return Host record for the domain record. This host_record can have at most 253 characters, and each part split with &#34;.&#34; can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;*&#34;,&#34;@&#34;,  and must not begin or end with &#34;-&#34;.
     * 
     */
    public Output<String> hostRecord() {
        return this.hostRecord;
    }

    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using alicloud.dns.getResolutionLines in data source to get the value.
     * 
     */
    @Import(name="routing")
    private @Nullable Output<String> routing;

    /**
     * @return The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using alicloud.dns.getResolutionLines in data source to get the value.
     * 
     */
    public Optional<Output<String>> routing() {
        return Optional.ofNullable(this.routing);
    }

    /**
     * The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it&#39;s no need to add a `.` at the end.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it&#39;s no need to add a `.` at the end.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private RecordArgs() {}

    private RecordArgs(RecordArgs $) {
        this.hostRecord = $.hostRecord;
        this.name = $.name;
        this.priority = $.priority;
        this.routing = $.routing;
        this.ttl = $.ttl;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordArgs $;

        public Builder() {
            $ = new RecordArgs();
        }

        public Builder(RecordArgs defaults) {
            $ = new RecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostRecord Host record for the domain record. This host_record can have at most 253 characters, and each part split with &#34;.&#34; can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;*&#34;,&#34;@&#34;,  and must not begin or end with &#34;-&#34;.
         * 
         * @return builder
         * 
         */
        public Builder hostRecord(Output<String> hostRecord) {
            $.hostRecord = hostRecord;
            return this;
        }

        /**
         * @param hostRecord Host record for the domain record. This host_record can have at most 253 characters, and each part split with &#34;.&#34; can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;*&#34;,&#34;@&#34;,  and must not begin or end with &#34;-&#34;.
         * 
         * @return builder
         * 
         */
        public Builder hostRecord(String hostRecord) {
            return hostRecord(Output.of(hostRecord));
        }

        /**
         * @param name Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param routing The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using alicloud.dns.getResolutionLines in data source to get the value.
         * 
         * @return builder
         * 
         */
        public Builder routing(@Nullable Output<String> routing) {
            $.routing = routing;
            return this;
        }

        /**
         * @param routing The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using alicloud.dns.getResolutionLines in data source to get the value.
         * 
         * @return builder
         * 
         */
        public Builder routing(String routing) {
            return routing(Output.of(routing));
        }

        /**
         * @param ttl The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param type The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it&#39;s no need to add a `.` at the end.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it&#39;s no need to add a `.` at the end.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RecordArgs build() {
            $.hostRecord = Objects.requireNonNull($.hostRecord, "expected parameter 'hostRecord' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}