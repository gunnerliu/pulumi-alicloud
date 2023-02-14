// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlidnsRecordsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlidnsRecordsArgs Empty = new GetAlidnsRecordsArgs();

    /**
     * Sorting direction. Valid values: `DESC`,`ASC`. Default to `AESC`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Sorting direction. Valid values: `DESC`,`ASC`. Default to `AESC`.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * The domain name associated to the records.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The domain name associated to the records.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * Domain name group ID.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<Integer> groupId;

    /**
     * @return Domain name group ID.
     * 
     */
    public Optional<Output<Integer>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * A list of record IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of record IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Keywords.
     * 
     */
    @Import(name="keyWord")
    private @Nullable Output<String> keyWord;

    /**
     * @return Keywords.
     * 
     */
    public Optional<Output<String>> keyWord() {
        return Optional.ofNullable(this.keyWord);
    }

    /**
     * User language.
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return User language.
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * ISP line. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
     * 
     */
    @Import(name="line")
    private @Nullable Output<String> line;

    /**
     * @return ISP line. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
     * 
     */
    public Optional<Output<String>> line() {
        return Optional.ofNullable(this.line);
    }

    /**
     * Sort by. Sort from newest to oldest according to the time added by resolution.
     * 
     */
    @Import(name="orderBy")
    private @Nullable Output<String> orderBy;

    /**
     * @return Sort by. Sort from newest to oldest according to the time added by resolution.
     * 
     */
    public Optional<Output<String>> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The keywords recorded by the host are searched according to the `%RRKeyWord%` mode, and are not case sensitive.
     * 
     */
    @Import(name="rrKeyWord")
    private @Nullable Output<String> rrKeyWord;

    /**
     * @return The keywords recorded by the host are searched according to the `%RRKeyWord%` mode, and are not case sensitive.
     * 
     */
    public Optional<Output<String>> rrKeyWord() {
        return Optional.ofNullable(this.rrKeyWord);
    }

    /**
     * Host record regex.
     * 
     */
    @Import(name="rrRegex")
    private @Nullable Output<String> rrRegex;

    /**
     * @return Host record regex.
     * 
     */
    public Optional<Output<String>> rrRegex() {
        return Optional.ofNullable(this.rrRegex);
    }

    /**
     * Search mode, Valid values: `LIKE`, `EXACT`, `ADVANCED`, `LIKE` (fuzzy), `EXACT` (accurate) search supports KeyWord field, `ADVANCED` (advanced) mode supports other fields.
     * 
     */
    @Import(name="searchMode")
    private @Nullable Output<String> searchMode;

    /**
     * @return Search mode, Valid values: `LIKE`, `EXACT`, `ADVANCED`, `LIKE` (fuzzy), `EXACT` (accurate) search supports KeyWord field, `ADVANCED` (advanced) mode supports other fields.
     * 
     */
    public Optional<Output<String>> searchMode() {
        return Optional.ofNullable(this.searchMode);
    }

    /**
     * Record status. Valid values: `ENABLE` and `DISABLE`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Record status. Valid values: `ENABLE` and `DISABLE`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Record type. Valid values: `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Record type. Valid values: `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Analyze type keywords, search by full match, not case sensitive.
     * 
     */
    @Import(name="typeKeyWord")
    private @Nullable Output<String> typeKeyWord;

    /**
     * @return Analyze type keywords, search by full match, not case sensitive.
     * 
     */
    public Optional<Output<String>> typeKeyWord() {
        return Optional.ofNullable(this.typeKeyWord);
    }

    /**
     * The keywords of the recorded value are searched according to the `%ValueKeyWord%` mode, and are not case sensitive.
     * 
     */
    @Import(name="valueKeyWord")
    private @Nullable Output<String> valueKeyWord;

    /**
     * @return The keywords of the recorded value are searched according to the `%ValueKeyWord%` mode, and are not case sensitive.
     * 
     */
    public Optional<Output<String>> valueKeyWord() {
        return Optional.ofNullable(this.valueKeyWord);
    }

    /**
     * Host record value regex.
     * 
     */
    @Import(name="valueRegex")
    private @Nullable Output<String> valueRegex;

    /**
     * @return Host record value regex.
     * 
     */
    public Optional<Output<String>> valueRegex() {
        return Optional.ofNullable(this.valueRegex);
    }

    private GetAlidnsRecordsArgs() {}

    private GetAlidnsRecordsArgs(GetAlidnsRecordsArgs $) {
        this.direction = $.direction;
        this.domainName = $.domainName;
        this.groupId = $.groupId;
        this.ids = $.ids;
        this.keyWord = $.keyWord;
        this.lang = $.lang;
        this.line = $.line;
        this.orderBy = $.orderBy;
        this.outputFile = $.outputFile;
        this.rrKeyWord = $.rrKeyWord;
        this.rrRegex = $.rrRegex;
        this.searchMode = $.searchMode;
        this.status = $.status;
        this.type = $.type;
        this.typeKeyWord = $.typeKeyWord;
        this.valueKeyWord = $.valueKeyWord;
        this.valueRegex = $.valueRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlidnsRecordsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlidnsRecordsArgs $;

        public Builder() {
            $ = new GetAlidnsRecordsArgs();
        }

        public Builder(GetAlidnsRecordsArgs defaults) {
            $ = new GetAlidnsRecordsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction Sorting direction. Valid values: `DESC`,`ASC`. Default to `AESC`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Sorting direction. Valid values: `DESC`,`ASC`. Default to `AESC`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param domainName The domain name associated to the records.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The domain name associated to the records.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param groupId Domain name group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<Integer> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Domain name group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Integer groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param ids A list of record IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of record IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of record IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param keyWord Keywords.
         * 
         * @return builder
         * 
         */
        public Builder keyWord(@Nullable Output<String> keyWord) {
            $.keyWord = keyWord;
            return this;
        }

        /**
         * @param keyWord Keywords.
         * 
         * @return builder
         * 
         */
        public Builder keyWord(String keyWord) {
            return keyWord(Output.of(keyWord));
        }

        /**
         * @param lang User language.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang User language.
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        /**
         * @param line ISP line. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
         * 
         * @return builder
         * 
         */
        public Builder line(@Nullable Output<String> line) {
            $.line = line;
            return this;
        }

        /**
         * @param line ISP line. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
         * 
         * @return builder
         * 
         */
        public Builder line(String line) {
            return line(Output.of(line));
        }

        /**
         * @param orderBy Sort by. Sort from newest to oldest according to the time added by resolution.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable Output<String> orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        /**
         * @param orderBy Sort by. Sort from newest to oldest according to the time added by resolution.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(String orderBy) {
            return orderBy(Output.of(orderBy));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param rrKeyWord The keywords recorded by the host are searched according to the `%RRKeyWord%` mode, and are not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder rrKeyWord(@Nullable Output<String> rrKeyWord) {
            $.rrKeyWord = rrKeyWord;
            return this;
        }

        /**
         * @param rrKeyWord The keywords recorded by the host are searched according to the `%RRKeyWord%` mode, and are not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder rrKeyWord(String rrKeyWord) {
            return rrKeyWord(Output.of(rrKeyWord));
        }

        /**
         * @param rrRegex Host record regex.
         * 
         * @return builder
         * 
         */
        public Builder rrRegex(@Nullable Output<String> rrRegex) {
            $.rrRegex = rrRegex;
            return this;
        }

        /**
         * @param rrRegex Host record regex.
         * 
         * @return builder
         * 
         */
        public Builder rrRegex(String rrRegex) {
            return rrRegex(Output.of(rrRegex));
        }

        /**
         * @param searchMode Search mode, Valid values: `LIKE`, `EXACT`, `ADVANCED`, `LIKE` (fuzzy), `EXACT` (accurate) search supports KeyWord field, `ADVANCED` (advanced) mode supports other fields.
         * 
         * @return builder
         * 
         */
        public Builder searchMode(@Nullable Output<String> searchMode) {
            $.searchMode = searchMode;
            return this;
        }

        /**
         * @param searchMode Search mode, Valid values: `LIKE`, `EXACT`, `ADVANCED`, `LIKE` (fuzzy), `EXACT` (accurate) search supports KeyWord field, `ADVANCED` (advanced) mode supports other fields.
         * 
         * @return builder
         * 
         */
        public Builder searchMode(String searchMode) {
            return searchMode(Output.of(searchMode));
        }

        /**
         * @param status Record status. Valid values: `ENABLE` and `DISABLE`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Record status. Valid values: `ENABLE` and `DISABLE`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type Record type. Valid values: `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Record type. Valid values: `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeKeyWord Analyze type keywords, search by full match, not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder typeKeyWord(@Nullable Output<String> typeKeyWord) {
            $.typeKeyWord = typeKeyWord;
            return this;
        }

        /**
         * @param typeKeyWord Analyze type keywords, search by full match, not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder typeKeyWord(String typeKeyWord) {
            return typeKeyWord(Output.of(typeKeyWord));
        }

        /**
         * @param valueKeyWord The keywords of the recorded value are searched according to the `%ValueKeyWord%` mode, and are not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder valueKeyWord(@Nullable Output<String> valueKeyWord) {
            $.valueKeyWord = valueKeyWord;
            return this;
        }

        /**
         * @param valueKeyWord The keywords of the recorded value are searched according to the `%ValueKeyWord%` mode, and are not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder valueKeyWord(String valueKeyWord) {
            return valueKeyWord(Output.of(valueKeyWord));
        }

        /**
         * @param valueRegex Host record value regex.
         * 
         * @return builder
         * 
         */
        public Builder valueRegex(@Nullable Output<String> valueRegex) {
            $.valueRegex = valueRegex;
            return this;
        }

        /**
         * @param valueRegex Host record value regex.
         * 
         * @return builder
         * 
         */
        public Builder valueRegex(String valueRegex) {
            return valueRegex(Output.of(valueRegex));
        }

        public GetAlidnsRecordsArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}