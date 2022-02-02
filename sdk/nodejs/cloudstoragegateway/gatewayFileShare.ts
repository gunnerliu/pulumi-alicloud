// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Storage Gateway Gateway File Share resource.
 *
 * For information about Cloud Storage Gateway Gateway File Share and how to use it, see [What is Gateway File Share](https://www.alibabacloud.com/help/zh/doc-detail/170298.htm).
 *
 * > **NOTE:** Available in v1.144.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultStocks = alicloud.cloudstoragegateway.getStocks({
 *     gatewayClass: "Standard",
 * });
 * const vpc = new alicloud.vpc.Network("vpc", {
 *     vpcName: "example_value",
 *     cidrBlock: "172.16.0.0/12",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: vpc.id,
 *     cidrBlock: "172.16.0.0/21",
 *     zoneId: defaultStocks.then(defaultStocks => defaultStocks.stocks?[0]?.zoneId),
 *     vswitchName: "example_value",
 * });
 * const defaultStorageBundle = new alicloud.cloudstoragegateway.StorageBundle("defaultStorageBundle", {storageBundleName: "example_value"});
 * const defaultGateway = new alicloud.cloudstoragegateway.Gateway("defaultGateway", {
 *     description: "tf-acctestDesalone",
 *     gatewayClass: "Standard",
 *     type: "File",
 *     paymentType: "PayAsYouGo",
 *     vswitchId: defaultSwitch.id,
 *     releaseAfterExpiration: true,
 *     publicNetworkBandwidth: 10,
 *     storageBundleId: defaultStorageBundle.id,
 *     location: "Cloud",
 *     gatewayName: "example_value",
 * });
 * const defaultGatewayCacheDisk = new alicloud.cloudstoragegateway.GatewayCacheDisk("defaultGatewayCacheDisk", {
 *     cacheDiskCategory: "cloud_efficiency",
 *     gatewayId: defaultGateway.id,
 *     cacheDiskSizeInGb: 50,
 * });
 * const defaultBucket = new alicloud.oss.Bucket("defaultBucket", {bucket: "example_value"});
 * const defaultGatewayFileShare = new alicloud.cloudstoragegateway.GatewayFileShare("defaultGatewayFileShare", {
 *     gatewayFileShareName: "example_value",
 *     gatewayId: defaultGateway.id,
 *     localPath: defaultGatewayCacheDisk.localFilePath,
 *     ossBucketName: defaultBucket.bucket,
 *     ossEndpoint: defaultBucket.extranetEndpoint,
 *     protocol: "NFS",
 *     remoteSync: true,
 *     pollingInterval: 4500,
 *     feLimit: 0,
 *     backendLimit: 0,
 *     cacheMode: "Cache",
 *     squash: "none",
 *     lagPeriod: 5,
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Storage Gateway Gateway File Share can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cloudstoragegateway/gatewayFileShare:GatewayFileShare example <gateway_id>:<index_id>
 * ```
 */
export class GatewayFileShare extends pulumi.CustomResource {
    /**
     * Get an existing GatewayFileShare resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayFileShareState, opts?: pulumi.CustomResourceOptions): GatewayFileShare {
        return new GatewayFileShare(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudstoragegateway/gatewayFileShare:GatewayFileShare';

    /**
     * Returns true if the given object is an instance of GatewayFileShare.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GatewayFileShare {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GatewayFileShare.__pulumiType;
    }

    /**
     * Whether to enable Windows ABE, the prime minister, need windowsAcl parameter is set to true in the entry into force of. Default value: `false`. **NOTE:** The attribute is valid when the attribute `protocol` is `SMB`. Gateway version >= 1.0.45 above support.
     */
    public readonly accessBasedEnumeration!: pulumi.Output<boolean>;
    /**
     * The Max upload speed of the gateway file share. Unit: `MB/s`, 0 means unlimited. Value range: `0` ~ `1280`. Default value: `0`. **NOTE:** at the same time if you have to limit the maximum write speed, maximum upload speed is no less than the maximum write speed.
     */
    public readonly backendLimit!: pulumi.Output<number>;
    /**
     * The whether browsable of the gateway file share (that is, in the network neighborhood of whether you can find). The attribute is valid when the attribute `protocol` is `SMB`. Default value: `true`.
     */
    public readonly browsable!: pulumi.Output<boolean>;
    /**
     * Direct reading OSS of the gateway file share.
     */
    public readonly bypassCacheRead!: pulumi.Output<boolean>;
    /**
     * The set up gateway file share cache mode. Value values: `Cache` or `Sync`. `Cache`: cached mode. `Sync`: replication mode are available. Default value: `Cache`.
     */
    public readonly cacheMode!: pulumi.Output<string>;
    /**
     * File sharing Whether to enable DirectIO (direct I/O mode for data transmission). Default value: `false`.
     */
    public readonly directIo!: pulumi.Output<boolean>;
    /**
     * The maximum download speed of the gateway file share. Unit: `MB/s`. `0` means unlimited. Value range: `0` ~ `1280`. **NOTE:** only in copy mode and enable download file data can be set. only when the shared opens the reverse synchronization or acceded to by the speed synchronization Group when, this parameter will not take effect. Gateway version >= 1.3.0 above support.
     */
    public readonly downloadLimit!: pulumi.Output<number>;
    /**
     * The whether to enable Upload optimization of the gateway file share, which is suitable for data pure backup migration scenarios. Default value: `false`. **NOTE:** Gateway version >= 1.0.39 above support.
     */
    public readonly fastReclaim!: pulumi.Output<boolean>;
    /**
     * The maximum write speed of the gateway file share. Unit: `MB/s`, `0` means unlimited. Value range: `0` ~ `1280`. Default value: `0`.
     */
    public readonly feLimit!: pulumi.Output<number>;
    /**
     * The name of the file share. Length from `1` to `255` characters can contain lowercase letters, digits, (.), (_) Or (-), at the same time, must start with a lowercase letter.
     */
    public readonly gatewayFileShareName!: pulumi.Output<string>;
    /**
     * The ID of the gateway.
     */
    public readonly gatewayId!: pulumi.Output<string>;
    /**
     * The whether to ignore deleted of the gateway file share. After the opening of the Gateway side delete file or delete cloud (OSS) corresponding to the file. Default value: `false`. **NOTE:** `ignoreDelete` and `remoteSync` cannot be enabled simultaneously. Gateway version >= 1.0.40 above support.
     */
    public readonly ignoreDelete!: pulumi.Output<boolean>;
    /**
     * The whether debris optimization of the gateway file share. Default value: `false`.
     */
    public readonly inPlace!: pulumi.Output<boolean>;
    /**
     * The ID of the file share.
     */
    public /*out*/ readonly indexId!: pulumi.Output<string>;
    /**
     * The synchronization delay, I.e. gateway local cache sync to Alibaba Cloud Object Storage Service (oss) of the delay time. Unit: `Seconds`. Value range: `5` ~ `120`. Default value: `5`. **NOTE:** Gateway version >= 1.0.40 above support.
     */
    public readonly lagPeriod!: pulumi.Output<number>;
    /**
     * The cache disk inside the device name.
     */
    public readonly localPath!: pulumi.Output<string>;
    /**
     * The set up gateway file share NFS protocol, whether to enable NFS v4 optimization improve Mount Upload efficiency. Default value: `false`. **NOTE:** If it is enabled, NFS V3 cannot be mounted. The attribute is valid when the attribute `protocol` is `NFS`. Gateway version >= 1.2.0 above support.
     */
    public readonly nfsV4Optimization!: pulumi.Output<boolean>;
    /**
     * The name of the OSS Bucket.
     */
    public readonly ossBucketName!: pulumi.Output<string>;
    /**
     * Whether they are using SSL connect to OSS Bucket.
     */
    public readonly ossBucketSsl!: pulumi.Output<boolean>;
    /**
     * The gateway file share corresponds to the Object Storage SERVICE (OSS), Bucket Endpoint. **NOTE:** distinguish between intranet and internet Endpoint. We recommend that if the OSS Bucket and the gateway is in the same Region is use the RDS intranet IP Endpoint: `oss-cn-hangzhou-internal.aliyuncs.com`.
     */
    public readonly ossEndpoint!: pulumi.Output<string>;
    /**
     * In part mode, the directory path group JSON format.
     */
    public readonly partialSyncPaths!: pulumi.Output<string | undefined>;
    /**
     * The subdirectory path under the object storage (OSS) bucket corresponding to the file share. If it is blank, it means the root directory of the bucket.
     */
    public readonly pathPrefix!: pulumi.Output<string | undefined>;
    /**
     * The reverse synchronization time intervals of the gateway file share. Value range: `15` ~ `36000`. **NOTE:** in copy mode + reverse synchronization is enabled Download file data, value range: `3600` ~ `36000`.
     */
    public readonly pollingInterval!: pulumi.Output<number | undefined>;
    /**
     * Share types. Valid values: `SMB`, `NFS`.
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * Whether to enable reverse synchronization of the gateway file share. Default value: `false`.
     */
    public readonly remoteSync!: pulumi.Output<boolean>;
    /**
     * Copy mode, whether to download the file data. Default value: `false`. **NOTE:** only when the attribute `remoteSync` is `true` or acceded to by the speed synchronization group, this parameter will not take effect.
     */
    public readonly remoteSyncDownload!: pulumi.Output<boolean>;
    /**
     * File sharing NFS read-only client list (IP address or IP address range). Use commas (,) to separate multiple clients.
     */
    public readonly roClientList!: pulumi.Output<string | undefined>;
    /**
     * The read-only client list. When Protocol for Server Message Block (SMB) to go back to.
     */
    public readonly roUserList!: pulumi.Output<string | undefined>;
    /**
     * Read and write the client list. When Protocol NFS is returned when the status is.
     */
    public readonly rwClientList!: pulumi.Output<string | undefined>;
    /**
     * Read-write user list. When Protocol for Server Message Block (SMB) to go back to.
     */
    public readonly rwUserList!: pulumi.Output<string | undefined>;
    /**
     * The NFS protocol user mapping of the gateway file share. Valid values: `none`, `rootSquash`, `allSquash`, `allAnonymous`. Default value: `none`. **NOTE:** The attribute is valid when the attribute `protocol` is `NFS`.
     */
    public readonly squash!: pulumi.Output<string>;
    /**
     * Whether to support the archive transparent read.
     */
    public readonly supportArchive!: pulumi.Output<boolean>;
    /**
     * The set up gateway file share whether to enable transmission acceleration needs corresponding OSS Bucket enabled transport acceleration. **NOTE:** Gateway version >= 1.3.0 above support.
     */
    public readonly transferAcceleration!: pulumi.Output<boolean>;
    /**
     * Whether to enable by Windows access list (requires AD domain) the permissions control. Default value: `false`. **NOTE:** The attribute is valid when the attribute `protocol` is `SMB`. Gateway version >= 1.0.45 above support.
     */
    public readonly windowsAcl!: pulumi.Output<boolean>;

    /**
     * Create a GatewayFileShare resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayFileShareArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayFileShareArgs | GatewayFileShareState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewayFileShareState | undefined;
            resourceInputs["accessBasedEnumeration"] = state ? state.accessBasedEnumeration : undefined;
            resourceInputs["backendLimit"] = state ? state.backendLimit : undefined;
            resourceInputs["browsable"] = state ? state.browsable : undefined;
            resourceInputs["bypassCacheRead"] = state ? state.bypassCacheRead : undefined;
            resourceInputs["cacheMode"] = state ? state.cacheMode : undefined;
            resourceInputs["directIo"] = state ? state.directIo : undefined;
            resourceInputs["downloadLimit"] = state ? state.downloadLimit : undefined;
            resourceInputs["fastReclaim"] = state ? state.fastReclaim : undefined;
            resourceInputs["feLimit"] = state ? state.feLimit : undefined;
            resourceInputs["gatewayFileShareName"] = state ? state.gatewayFileShareName : undefined;
            resourceInputs["gatewayId"] = state ? state.gatewayId : undefined;
            resourceInputs["ignoreDelete"] = state ? state.ignoreDelete : undefined;
            resourceInputs["inPlace"] = state ? state.inPlace : undefined;
            resourceInputs["indexId"] = state ? state.indexId : undefined;
            resourceInputs["lagPeriod"] = state ? state.lagPeriod : undefined;
            resourceInputs["localPath"] = state ? state.localPath : undefined;
            resourceInputs["nfsV4Optimization"] = state ? state.nfsV4Optimization : undefined;
            resourceInputs["ossBucketName"] = state ? state.ossBucketName : undefined;
            resourceInputs["ossBucketSsl"] = state ? state.ossBucketSsl : undefined;
            resourceInputs["ossEndpoint"] = state ? state.ossEndpoint : undefined;
            resourceInputs["partialSyncPaths"] = state ? state.partialSyncPaths : undefined;
            resourceInputs["pathPrefix"] = state ? state.pathPrefix : undefined;
            resourceInputs["pollingInterval"] = state ? state.pollingInterval : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["remoteSync"] = state ? state.remoteSync : undefined;
            resourceInputs["remoteSyncDownload"] = state ? state.remoteSyncDownload : undefined;
            resourceInputs["roClientList"] = state ? state.roClientList : undefined;
            resourceInputs["roUserList"] = state ? state.roUserList : undefined;
            resourceInputs["rwClientList"] = state ? state.rwClientList : undefined;
            resourceInputs["rwUserList"] = state ? state.rwUserList : undefined;
            resourceInputs["squash"] = state ? state.squash : undefined;
            resourceInputs["supportArchive"] = state ? state.supportArchive : undefined;
            resourceInputs["transferAcceleration"] = state ? state.transferAcceleration : undefined;
            resourceInputs["windowsAcl"] = state ? state.windowsAcl : undefined;
        } else {
            const args = argsOrState as GatewayFileShareArgs | undefined;
            if ((!args || args.gatewayFileShareName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gatewayFileShareName'");
            }
            if ((!args || args.gatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gatewayId'");
            }
            if ((!args || args.localPath === undefined) && !opts.urn) {
                throw new Error("Missing required property 'localPath'");
            }
            if ((!args || args.ossBucketName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ossBucketName'");
            }
            if ((!args || args.ossEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ossEndpoint'");
            }
            if ((!args || args.protocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'protocol'");
            }
            resourceInputs["accessBasedEnumeration"] = args ? args.accessBasedEnumeration : undefined;
            resourceInputs["backendLimit"] = args ? args.backendLimit : undefined;
            resourceInputs["browsable"] = args ? args.browsable : undefined;
            resourceInputs["bypassCacheRead"] = args ? args.bypassCacheRead : undefined;
            resourceInputs["cacheMode"] = args ? args.cacheMode : undefined;
            resourceInputs["directIo"] = args ? args.directIo : undefined;
            resourceInputs["downloadLimit"] = args ? args.downloadLimit : undefined;
            resourceInputs["fastReclaim"] = args ? args.fastReclaim : undefined;
            resourceInputs["feLimit"] = args ? args.feLimit : undefined;
            resourceInputs["gatewayFileShareName"] = args ? args.gatewayFileShareName : undefined;
            resourceInputs["gatewayId"] = args ? args.gatewayId : undefined;
            resourceInputs["ignoreDelete"] = args ? args.ignoreDelete : undefined;
            resourceInputs["inPlace"] = args ? args.inPlace : undefined;
            resourceInputs["lagPeriod"] = args ? args.lagPeriod : undefined;
            resourceInputs["localPath"] = args ? args.localPath : undefined;
            resourceInputs["nfsV4Optimization"] = args ? args.nfsV4Optimization : undefined;
            resourceInputs["ossBucketName"] = args ? args.ossBucketName : undefined;
            resourceInputs["ossBucketSsl"] = args ? args.ossBucketSsl : undefined;
            resourceInputs["ossEndpoint"] = args ? args.ossEndpoint : undefined;
            resourceInputs["partialSyncPaths"] = args ? args.partialSyncPaths : undefined;
            resourceInputs["pathPrefix"] = args ? args.pathPrefix : undefined;
            resourceInputs["pollingInterval"] = args ? args.pollingInterval : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["remoteSync"] = args ? args.remoteSync : undefined;
            resourceInputs["remoteSyncDownload"] = args ? args.remoteSyncDownload : undefined;
            resourceInputs["roClientList"] = args ? args.roClientList : undefined;
            resourceInputs["roUserList"] = args ? args.roUserList : undefined;
            resourceInputs["rwClientList"] = args ? args.rwClientList : undefined;
            resourceInputs["rwUserList"] = args ? args.rwUserList : undefined;
            resourceInputs["squash"] = args ? args.squash : undefined;
            resourceInputs["supportArchive"] = args ? args.supportArchive : undefined;
            resourceInputs["transferAcceleration"] = args ? args.transferAcceleration : undefined;
            resourceInputs["windowsAcl"] = args ? args.windowsAcl : undefined;
            resourceInputs["indexId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GatewayFileShare.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GatewayFileShare resources.
 */
export interface GatewayFileShareState {
    /**
     * Whether to enable Windows ABE, the prime minister, need windowsAcl parameter is set to true in the entry into force of. Default value: `false`. **NOTE:** The attribute is valid when the attribute `protocol` is `SMB`. Gateway version >= 1.0.45 above support.
     */
    accessBasedEnumeration?: pulumi.Input<boolean>;
    /**
     * The Max upload speed of the gateway file share. Unit: `MB/s`, 0 means unlimited. Value range: `0` ~ `1280`. Default value: `0`. **NOTE:** at the same time if you have to limit the maximum write speed, maximum upload speed is no less than the maximum write speed.
     */
    backendLimit?: pulumi.Input<number>;
    /**
     * The whether browsable of the gateway file share (that is, in the network neighborhood of whether you can find). The attribute is valid when the attribute `protocol` is `SMB`. Default value: `true`.
     */
    browsable?: pulumi.Input<boolean>;
    /**
     * Direct reading OSS of the gateway file share.
     */
    bypassCacheRead?: pulumi.Input<boolean>;
    /**
     * The set up gateway file share cache mode. Value values: `Cache` or `Sync`. `Cache`: cached mode. `Sync`: replication mode are available. Default value: `Cache`.
     */
    cacheMode?: pulumi.Input<string>;
    /**
     * File sharing Whether to enable DirectIO (direct I/O mode for data transmission). Default value: `false`.
     */
    directIo?: pulumi.Input<boolean>;
    /**
     * The maximum download speed of the gateway file share. Unit: `MB/s`. `0` means unlimited. Value range: `0` ~ `1280`. **NOTE:** only in copy mode and enable download file data can be set. only when the shared opens the reverse synchronization or acceded to by the speed synchronization Group when, this parameter will not take effect. Gateway version >= 1.3.0 above support.
     */
    downloadLimit?: pulumi.Input<number>;
    /**
     * The whether to enable Upload optimization of the gateway file share, which is suitable for data pure backup migration scenarios. Default value: `false`. **NOTE:** Gateway version >= 1.0.39 above support.
     */
    fastReclaim?: pulumi.Input<boolean>;
    /**
     * The maximum write speed of the gateway file share. Unit: `MB/s`, `0` means unlimited. Value range: `0` ~ `1280`. Default value: `0`.
     */
    feLimit?: pulumi.Input<number>;
    /**
     * The name of the file share. Length from `1` to `255` characters can contain lowercase letters, digits, (.), (_) Or (-), at the same time, must start with a lowercase letter.
     */
    gatewayFileShareName?: pulumi.Input<string>;
    /**
     * The ID of the gateway.
     */
    gatewayId?: pulumi.Input<string>;
    /**
     * The whether to ignore deleted of the gateway file share. After the opening of the Gateway side delete file or delete cloud (OSS) corresponding to the file. Default value: `false`. **NOTE:** `ignoreDelete` and `remoteSync` cannot be enabled simultaneously. Gateway version >= 1.0.40 above support.
     */
    ignoreDelete?: pulumi.Input<boolean>;
    /**
     * The whether debris optimization of the gateway file share. Default value: `false`.
     */
    inPlace?: pulumi.Input<boolean>;
    /**
     * The ID of the file share.
     */
    indexId?: pulumi.Input<string>;
    /**
     * The synchronization delay, I.e. gateway local cache sync to Alibaba Cloud Object Storage Service (oss) of the delay time. Unit: `Seconds`. Value range: `5` ~ `120`. Default value: `5`. **NOTE:** Gateway version >= 1.0.40 above support.
     */
    lagPeriod?: pulumi.Input<number>;
    /**
     * The cache disk inside the device name.
     */
    localPath?: pulumi.Input<string>;
    /**
     * The set up gateway file share NFS protocol, whether to enable NFS v4 optimization improve Mount Upload efficiency. Default value: `false`. **NOTE:** If it is enabled, NFS V3 cannot be mounted. The attribute is valid when the attribute `protocol` is `NFS`. Gateway version >= 1.2.0 above support.
     */
    nfsV4Optimization?: pulumi.Input<boolean>;
    /**
     * The name of the OSS Bucket.
     */
    ossBucketName?: pulumi.Input<string>;
    /**
     * Whether they are using SSL connect to OSS Bucket.
     */
    ossBucketSsl?: pulumi.Input<boolean>;
    /**
     * The gateway file share corresponds to the Object Storage SERVICE (OSS), Bucket Endpoint. **NOTE:** distinguish between intranet and internet Endpoint. We recommend that if the OSS Bucket and the gateway is in the same Region is use the RDS intranet IP Endpoint: `oss-cn-hangzhou-internal.aliyuncs.com`.
     */
    ossEndpoint?: pulumi.Input<string>;
    /**
     * In part mode, the directory path group JSON format.
     */
    partialSyncPaths?: pulumi.Input<string>;
    /**
     * The subdirectory path under the object storage (OSS) bucket corresponding to the file share. If it is blank, it means the root directory of the bucket.
     */
    pathPrefix?: pulumi.Input<string>;
    /**
     * The reverse synchronization time intervals of the gateway file share. Value range: `15` ~ `36000`. **NOTE:** in copy mode + reverse synchronization is enabled Download file data, value range: `3600` ~ `36000`.
     */
    pollingInterval?: pulumi.Input<number>;
    /**
     * Share types. Valid values: `SMB`, `NFS`.
     */
    protocol?: pulumi.Input<string>;
    /**
     * Whether to enable reverse synchronization of the gateway file share. Default value: `false`.
     */
    remoteSync?: pulumi.Input<boolean>;
    /**
     * Copy mode, whether to download the file data. Default value: `false`. **NOTE:** only when the attribute `remoteSync` is `true` or acceded to by the speed synchronization group, this parameter will not take effect.
     */
    remoteSyncDownload?: pulumi.Input<boolean>;
    /**
     * File sharing NFS read-only client list (IP address or IP address range). Use commas (,) to separate multiple clients.
     */
    roClientList?: pulumi.Input<string>;
    /**
     * The read-only client list. When Protocol for Server Message Block (SMB) to go back to.
     */
    roUserList?: pulumi.Input<string>;
    /**
     * Read and write the client list. When Protocol NFS is returned when the status is.
     */
    rwClientList?: pulumi.Input<string>;
    /**
     * Read-write user list. When Protocol for Server Message Block (SMB) to go back to.
     */
    rwUserList?: pulumi.Input<string>;
    /**
     * The NFS protocol user mapping of the gateway file share. Valid values: `none`, `rootSquash`, `allSquash`, `allAnonymous`. Default value: `none`. **NOTE:** The attribute is valid when the attribute `protocol` is `NFS`.
     */
    squash?: pulumi.Input<string>;
    /**
     * Whether to support the archive transparent read.
     */
    supportArchive?: pulumi.Input<boolean>;
    /**
     * The set up gateway file share whether to enable transmission acceleration needs corresponding OSS Bucket enabled transport acceleration. **NOTE:** Gateway version >= 1.3.0 above support.
     */
    transferAcceleration?: pulumi.Input<boolean>;
    /**
     * Whether to enable by Windows access list (requires AD domain) the permissions control. Default value: `false`. **NOTE:** The attribute is valid when the attribute `protocol` is `SMB`. Gateway version >= 1.0.45 above support.
     */
    windowsAcl?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GatewayFileShare resource.
 */
export interface GatewayFileShareArgs {
    /**
     * Whether to enable Windows ABE, the prime minister, need windowsAcl parameter is set to true in the entry into force of. Default value: `false`. **NOTE:** The attribute is valid when the attribute `protocol` is `SMB`. Gateway version >= 1.0.45 above support.
     */
    accessBasedEnumeration?: pulumi.Input<boolean>;
    /**
     * The Max upload speed of the gateway file share. Unit: `MB/s`, 0 means unlimited. Value range: `0` ~ `1280`. Default value: `0`. **NOTE:** at the same time if you have to limit the maximum write speed, maximum upload speed is no less than the maximum write speed.
     */
    backendLimit?: pulumi.Input<number>;
    /**
     * The whether browsable of the gateway file share (that is, in the network neighborhood of whether you can find). The attribute is valid when the attribute `protocol` is `SMB`. Default value: `true`.
     */
    browsable?: pulumi.Input<boolean>;
    /**
     * Direct reading OSS of the gateway file share.
     */
    bypassCacheRead?: pulumi.Input<boolean>;
    /**
     * The set up gateway file share cache mode. Value values: `Cache` or `Sync`. `Cache`: cached mode. `Sync`: replication mode are available. Default value: `Cache`.
     */
    cacheMode?: pulumi.Input<string>;
    /**
     * File sharing Whether to enable DirectIO (direct I/O mode for data transmission). Default value: `false`.
     */
    directIo?: pulumi.Input<boolean>;
    /**
     * The maximum download speed of the gateway file share. Unit: `MB/s`. `0` means unlimited. Value range: `0` ~ `1280`. **NOTE:** only in copy mode and enable download file data can be set. only when the shared opens the reverse synchronization or acceded to by the speed synchronization Group when, this parameter will not take effect. Gateway version >= 1.3.0 above support.
     */
    downloadLimit?: pulumi.Input<number>;
    /**
     * The whether to enable Upload optimization of the gateway file share, which is suitable for data pure backup migration scenarios. Default value: `false`. **NOTE:** Gateway version >= 1.0.39 above support.
     */
    fastReclaim?: pulumi.Input<boolean>;
    /**
     * The maximum write speed of the gateway file share. Unit: `MB/s`, `0` means unlimited. Value range: `0` ~ `1280`. Default value: `0`.
     */
    feLimit?: pulumi.Input<number>;
    /**
     * The name of the file share. Length from `1` to `255` characters can contain lowercase letters, digits, (.), (_) Or (-), at the same time, must start with a lowercase letter.
     */
    gatewayFileShareName: pulumi.Input<string>;
    /**
     * The ID of the gateway.
     */
    gatewayId: pulumi.Input<string>;
    /**
     * The whether to ignore deleted of the gateway file share. After the opening of the Gateway side delete file or delete cloud (OSS) corresponding to the file. Default value: `false`. **NOTE:** `ignoreDelete` and `remoteSync` cannot be enabled simultaneously. Gateway version >= 1.0.40 above support.
     */
    ignoreDelete?: pulumi.Input<boolean>;
    /**
     * The whether debris optimization of the gateway file share. Default value: `false`.
     */
    inPlace?: pulumi.Input<boolean>;
    /**
     * The synchronization delay, I.e. gateway local cache sync to Alibaba Cloud Object Storage Service (oss) of the delay time. Unit: `Seconds`. Value range: `5` ~ `120`. Default value: `5`. **NOTE:** Gateway version >= 1.0.40 above support.
     */
    lagPeriod?: pulumi.Input<number>;
    /**
     * The cache disk inside the device name.
     */
    localPath: pulumi.Input<string>;
    /**
     * The set up gateway file share NFS protocol, whether to enable NFS v4 optimization improve Mount Upload efficiency. Default value: `false`. **NOTE:** If it is enabled, NFS V3 cannot be mounted. The attribute is valid when the attribute `protocol` is `NFS`. Gateway version >= 1.2.0 above support.
     */
    nfsV4Optimization?: pulumi.Input<boolean>;
    /**
     * The name of the OSS Bucket.
     */
    ossBucketName: pulumi.Input<string>;
    /**
     * Whether they are using SSL connect to OSS Bucket.
     */
    ossBucketSsl?: pulumi.Input<boolean>;
    /**
     * The gateway file share corresponds to the Object Storage SERVICE (OSS), Bucket Endpoint. **NOTE:** distinguish between intranet and internet Endpoint. We recommend that if the OSS Bucket and the gateway is in the same Region is use the RDS intranet IP Endpoint: `oss-cn-hangzhou-internal.aliyuncs.com`.
     */
    ossEndpoint: pulumi.Input<string>;
    /**
     * In part mode, the directory path group JSON format.
     */
    partialSyncPaths?: pulumi.Input<string>;
    /**
     * The subdirectory path under the object storage (OSS) bucket corresponding to the file share. If it is blank, it means the root directory of the bucket.
     */
    pathPrefix?: pulumi.Input<string>;
    /**
     * The reverse synchronization time intervals of the gateway file share. Value range: `15` ~ `36000`. **NOTE:** in copy mode + reverse synchronization is enabled Download file data, value range: `3600` ~ `36000`.
     */
    pollingInterval?: pulumi.Input<number>;
    /**
     * Share types. Valid values: `SMB`, `NFS`.
     */
    protocol: pulumi.Input<string>;
    /**
     * Whether to enable reverse synchronization of the gateway file share. Default value: `false`.
     */
    remoteSync?: pulumi.Input<boolean>;
    /**
     * Copy mode, whether to download the file data. Default value: `false`. **NOTE:** only when the attribute `remoteSync` is `true` or acceded to by the speed synchronization group, this parameter will not take effect.
     */
    remoteSyncDownload?: pulumi.Input<boolean>;
    /**
     * File sharing NFS read-only client list (IP address or IP address range). Use commas (,) to separate multiple clients.
     */
    roClientList?: pulumi.Input<string>;
    /**
     * The read-only client list. When Protocol for Server Message Block (SMB) to go back to.
     */
    roUserList?: pulumi.Input<string>;
    /**
     * Read and write the client list. When Protocol NFS is returned when the status is.
     */
    rwClientList?: pulumi.Input<string>;
    /**
     * Read-write user list. When Protocol for Server Message Block (SMB) to go back to.
     */
    rwUserList?: pulumi.Input<string>;
    /**
     * The NFS protocol user mapping of the gateway file share. Valid values: `none`, `rootSquash`, `allSquash`, `allAnonymous`. Default value: `none`. **NOTE:** The attribute is valid when the attribute `protocol` is `NFS`.
     */
    squash?: pulumi.Input<string>;
    /**
     * Whether to support the archive transparent read.
     */
    supportArchive?: pulumi.Input<boolean>;
    /**
     * The set up gateway file share whether to enable transmission acceleration needs corresponding OSS Bucket enabled transport acceleration. **NOTE:** Gateway version >= 1.3.0 above support.
     */
    transferAcceleration?: pulumi.Input<boolean>;
    /**
     * Whether to enable by Windows access list (requires AD domain) the permissions control. Default value: `false`. **NOTE:** The attribute is valid when the attribute `protocol` is `SMB`. Gateway version >= 1.0.45 above support.
     */
    windowsAcl?: pulumi.Input<boolean>;
}
