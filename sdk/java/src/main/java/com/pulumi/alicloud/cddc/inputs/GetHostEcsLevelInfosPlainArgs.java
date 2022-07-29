// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cddc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHostEcsLevelInfosPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostEcsLevelInfosPlainArgs Empty = new GetHostEcsLevelInfosPlainArgs();

    /**
     * The database engine of the host. Valid values: `mysql`, `mssql`, `pgsql`, `redis`.
     * 
     */
    @Import(name="dbType", required=true)
    private String dbType;

    /**
     * @return The database engine of the host. Valid values: `mysql`, `mssql`, `pgsql`, `redis`.
     * 
     */
    public String dbType() {
        return this.dbType;
    }

    /**
     * Host image. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
     * 
     */
    @Import(name="imageCategory")
    private @Nullable String imageCategory;

    /**
     * @return Host image. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
     * 
     */
    public Optional<String> imageCategory() {
        return Optional.ofNullable(this.imageCategory);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The storage type of the host ecs level info. Valid values: `local_ssd`, `cloud_essd`, `cloud_essd2`, `cloud_essd3`.
     * * `local_ssd`: specifies that the host uses local SSDs.
     * * `cloud_essd`: specifies that the host uses enhanced SSDs (ESSDs) of performance level (PL) 1.
     * * `cloud_essd2`: specifies that the host uses ESSDs of PL2.
     * * `cloud_essd3`: specifies that the host uses ESSDs of PL3.
     * 
     */
    @Import(name="storageType", required=true)
    private String storageType;

    /**
     * @return The storage type of the host ecs level info. Valid values: `local_ssd`, `cloud_essd`, `cloud_essd2`, `cloud_essd3`.
     * * `local_ssd`: specifies that the host uses local SSDs.
     * * `cloud_essd`: specifies that the host uses enhanced SSDs (ESSDs) of performance level (PL) 1.
     * * `cloud_essd2`: specifies that the host uses ESSDs of PL2.
     * * `cloud_essd3`: specifies that the host uses ESSDs of PL3.
     * 
     */
    public String storageType() {
        return this.storageType;
    }

    /**
     * The ID of the zone in the region.
     * 
     */
    @Import(name="zoneId", required=true)
    private String zoneId;

    /**
     * @return The ID of the zone in the region.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    private GetHostEcsLevelInfosPlainArgs() {}

    private GetHostEcsLevelInfosPlainArgs(GetHostEcsLevelInfosPlainArgs $) {
        this.dbType = $.dbType;
        this.imageCategory = $.imageCategory;
        this.outputFile = $.outputFile;
        this.storageType = $.storageType;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostEcsLevelInfosPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostEcsLevelInfosPlainArgs $;

        public Builder() {
            $ = new GetHostEcsLevelInfosPlainArgs();
        }

        public Builder(GetHostEcsLevelInfosPlainArgs defaults) {
            $ = new GetHostEcsLevelInfosPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbType The database engine of the host. Valid values: `mysql`, `mssql`, `pgsql`, `redis`.
         * 
         * @return builder
         * 
         */
        public Builder dbType(String dbType) {
            $.dbType = dbType;
            return this;
        }

        /**
         * @param imageCategory Host image. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
         * 
         * @return builder
         * 
         */
        public Builder imageCategory(@Nullable String imageCategory) {
            $.imageCategory = imageCategory;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param storageType The storage type of the host ecs level info. Valid values: `local_ssd`, `cloud_essd`, `cloud_essd2`, `cloud_essd3`.
         * * `local_ssd`: specifies that the host uses local SSDs.
         * * `cloud_essd`: specifies that the host uses enhanced SSDs (ESSDs) of performance level (PL) 1.
         * * `cloud_essd2`: specifies that the host uses ESSDs of PL2.
         * * `cloud_essd3`: specifies that the host uses ESSDs of PL3.
         * 
         * @return builder
         * 
         */
        public Builder storageType(String storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param zoneId The ID of the zone in the region.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetHostEcsLevelInfosPlainArgs build() {
            $.dbType = Objects.requireNonNull($.dbType, "expected parameter 'dbType' to be non-null");
            $.storageType = Objects.requireNonNull($.storageType, "expected parameter 'storageType' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
