// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a DMS Enterprise Instance resource.
 * 
 * > **NOTE:** API users must first register in DMS.
 * > **NOTE:** Available in 1.81.0+.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const defaultEnterpriseInstance = new alicloud.dms.EnterpriseInstance("default", {
 *     databasePassword: "Yourpassword123",
 *     databaseUser: "yourUserName",
 *     dbaUid: Number.parseFloat("1182725234xxxxxxx"),
 *     ecsRegion: "cn-shanghai",
 *     envType: "test",
 *     exportTimeout: 600,
 *     host: "rm-uf648hgsxxxxxx.mysql.rds.aliyuncs.com",
 *     instanceAlias: "yourAliasName",
 *     instanceSource: "RDS",
 *     instanceType: "MySQL",
 *     networkType: "VPC",
 *     port: 3306,
 *     queryTimeout: 60,
 *     safeRule: "自由操作",
 *     tid: 12345,
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/dms_enterprise_instance.html.markdown.
 */
export class EnterpriseInstance extends pulumi.CustomResource {
    /**
     * Get an existing EnterpriseInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnterpriseInstanceState, opts?: pulumi.CustomResourceOptions): EnterpriseInstance {
        return new EnterpriseInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dms/enterpriseInstance:EnterpriseInstance';

    /**
     * Returns true if the given object is an instance of EnterpriseInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EnterpriseInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EnterpriseInstance.__pulumiType;
    }

    /**
     * Cross-database query datalink name.
     */
    public readonly dataLinkName!: pulumi.Output<string | undefined>;
    /**
     * Database access password.
     */
    public readonly databasePassword!: pulumi.Output<string>;
    /**
     * Database access account.
     */
    public readonly databaseUser!: pulumi.Output<string>;
    public readonly dbaId!: pulumi.Output<string>;
    /**
     * The instance dba nickname.
     */
    public /*out*/ readonly dbaNickName!: pulumi.Output<string>;
    /**
     * The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
     */
    public readonly dbaUid!: pulumi.Output<number>;
    /**
     * Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
     */
    public readonly ddlOnline!: pulumi.Output<number | undefined>;
    /**
     * ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
     */
    public readonly ecsInstanceId!: pulumi.Output<string>;
    /**
     * The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
     */
    public readonly ecsRegion!: pulumi.Output<string | undefined>;
    /**
     * Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
     */
    public readonly envType!: pulumi.Output<string>;
    /**
     * Export timeout, unit: s (seconds).
     */
    public readonly exportTimeout!: pulumi.Output<number>;
    /**
     * Host address of the target database.
     */
    public readonly host!: pulumi.Output<string>;
    /**
     * Instance alias, to help users quickly distinguish positioning.
     */
    public readonly instanceAlias!: pulumi.Output<string>;
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
     */
    public readonly instanceSource!: pulumi.Output<string>;
    /**
     * Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
     */
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * Network type. Valid values: `CLASSIC`, `VPC`.
     */
    public readonly networkType!: pulumi.Output<string>;
    /**
     * Access port of the target database.
     */
    public readonly port!: pulumi.Output<number>;
    /**
     * Query timeout time, unit: s (seconds).
     */
    public readonly queryTimeout!: pulumi.Output<number>;
    /**
     * The security rule of the instance is passed into the name of the security rule in the enterprise.
     */
    public readonly safeRule!: pulumi.Output<string>;
    public readonly safeRuleId!: pulumi.Output<string>;
    /**
     * The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
     */
    public readonly sid!: pulumi.Output<string | undefined>;
    /**
     * The instance status.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The tenant ID. 
     */
    public readonly tid!: pulumi.Output<number | undefined>;
    /**
     * Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
     */
    public readonly useDsql!: pulumi.Output<number | undefined>;
    /**
     * VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
     */
    public readonly vpcId!: pulumi.Output<string | undefined>;

    /**
     * Create a EnterpriseInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnterpriseInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnterpriseInstanceArgs | EnterpriseInstanceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as EnterpriseInstanceState | undefined;
            inputs["dataLinkName"] = state ? state.dataLinkName : undefined;
            inputs["databasePassword"] = state ? state.databasePassword : undefined;
            inputs["databaseUser"] = state ? state.databaseUser : undefined;
            inputs["dbaId"] = state ? state.dbaId : undefined;
            inputs["dbaNickName"] = state ? state.dbaNickName : undefined;
            inputs["dbaUid"] = state ? state.dbaUid : undefined;
            inputs["ddlOnline"] = state ? state.ddlOnline : undefined;
            inputs["ecsInstanceId"] = state ? state.ecsInstanceId : undefined;
            inputs["ecsRegion"] = state ? state.ecsRegion : undefined;
            inputs["envType"] = state ? state.envType : undefined;
            inputs["exportTimeout"] = state ? state.exportTimeout : undefined;
            inputs["host"] = state ? state.host : undefined;
            inputs["instanceAlias"] = state ? state.instanceAlias : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
            inputs["instanceSource"] = state ? state.instanceSource : undefined;
            inputs["instanceType"] = state ? state.instanceType : undefined;
            inputs["networkType"] = state ? state.networkType : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["queryTimeout"] = state ? state.queryTimeout : undefined;
            inputs["safeRule"] = state ? state.safeRule : undefined;
            inputs["safeRuleId"] = state ? state.safeRuleId : undefined;
            inputs["sid"] = state ? state.sid : undefined;
            inputs["state"] = state ? state.state : undefined;
            inputs["tid"] = state ? state.tid : undefined;
            inputs["useDsql"] = state ? state.useDsql : undefined;
            inputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as EnterpriseInstanceArgs | undefined;
            if (!args || args.databasePassword === undefined) {
                throw new Error("Missing required property 'databasePassword'");
            }
            if (!args || args.databaseUser === undefined) {
                throw new Error("Missing required property 'databaseUser'");
            }
            if (!args || args.dbaUid === undefined) {
                throw new Error("Missing required property 'dbaUid'");
            }
            if (!args || args.envType === undefined) {
                throw new Error("Missing required property 'envType'");
            }
            if (!args || args.exportTimeout === undefined) {
                throw new Error("Missing required property 'exportTimeout'");
            }
            if (!args || args.host === undefined) {
                throw new Error("Missing required property 'host'");
            }
            if (!args || args.instanceAlias === undefined) {
                throw new Error("Missing required property 'instanceAlias'");
            }
            if (!args || args.instanceSource === undefined) {
                throw new Error("Missing required property 'instanceSource'");
            }
            if (!args || args.instanceType === undefined) {
                throw new Error("Missing required property 'instanceType'");
            }
            if (!args || args.networkType === undefined) {
                throw new Error("Missing required property 'networkType'");
            }
            if (!args || args.port === undefined) {
                throw new Error("Missing required property 'port'");
            }
            if (!args || args.queryTimeout === undefined) {
                throw new Error("Missing required property 'queryTimeout'");
            }
            if (!args || args.safeRule === undefined) {
                throw new Error("Missing required property 'safeRule'");
            }
            inputs["dataLinkName"] = args ? args.dataLinkName : undefined;
            inputs["databasePassword"] = args ? args.databasePassword : undefined;
            inputs["databaseUser"] = args ? args.databaseUser : undefined;
            inputs["dbaId"] = args ? args.dbaId : undefined;
            inputs["dbaUid"] = args ? args.dbaUid : undefined;
            inputs["ddlOnline"] = args ? args.ddlOnline : undefined;
            inputs["ecsInstanceId"] = args ? args.ecsInstanceId : undefined;
            inputs["ecsRegion"] = args ? args.ecsRegion : undefined;
            inputs["envType"] = args ? args.envType : undefined;
            inputs["exportTimeout"] = args ? args.exportTimeout : undefined;
            inputs["host"] = args ? args.host : undefined;
            inputs["instanceAlias"] = args ? args.instanceAlias : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
            inputs["instanceSource"] = args ? args.instanceSource : undefined;
            inputs["instanceType"] = args ? args.instanceType : undefined;
            inputs["networkType"] = args ? args.networkType : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["queryTimeout"] = args ? args.queryTimeout : undefined;
            inputs["safeRule"] = args ? args.safeRule : undefined;
            inputs["safeRuleId"] = args ? args.safeRuleId : undefined;
            inputs["sid"] = args ? args.sid : undefined;
            inputs["tid"] = args ? args.tid : undefined;
            inputs["useDsql"] = args ? args.useDsql : undefined;
            inputs["vpcId"] = args ? args.vpcId : undefined;
            inputs["dbaNickName"] = undefined /*out*/;
            inputs["state"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(EnterpriseInstance.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EnterpriseInstance resources.
 */
export interface EnterpriseInstanceState {
    /**
     * Cross-database query datalink name.
     */
    readonly dataLinkName?: pulumi.Input<string>;
    /**
     * Database access password.
     */
    readonly databasePassword?: pulumi.Input<string>;
    /**
     * Database access account.
     */
    readonly databaseUser?: pulumi.Input<string>;
    readonly dbaId?: pulumi.Input<string>;
    /**
     * The instance dba nickname.
     */
    readonly dbaNickName?: pulumi.Input<string>;
    /**
     * The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
     */
    readonly dbaUid?: pulumi.Input<number>;
    /**
     * Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
     */
    readonly ddlOnline?: pulumi.Input<number>;
    /**
     * ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
     */
    readonly ecsInstanceId?: pulumi.Input<string>;
    /**
     * The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
     */
    readonly ecsRegion?: pulumi.Input<string>;
    /**
     * Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
     */
    readonly envType?: pulumi.Input<string>;
    /**
     * Export timeout, unit: s (seconds).
     */
    readonly exportTimeout?: pulumi.Input<number>;
    /**
     * Host address of the target database.
     */
    readonly host?: pulumi.Input<string>;
    /**
     * Instance alias, to help users quickly distinguish positioning.
     */
    readonly instanceAlias?: pulumi.Input<string>;
    readonly instanceId?: pulumi.Input<string>;
    /**
     * The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
     */
    readonly instanceSource?: pulumi.Input<string>;
    /**
     * Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * Network type. Valid values: `CLASSIC`, `VPC`.
     */
    readonly networkType?: pulumi.Input<string>;
    /**
     * Access port of the target database.
     */
    readonly port?: pulumi.Input<number>;
    /**
     * Query timeout time, unit: s (seconds).
     */
    readonly queryTimeout?: pulumi.Input<number>;
    /**
     * The security rule of the instance is passed into the name of the security rule in the enterprise.
     */
    readonly safeRule?: pulumi.Input<string>;
    readonly safeRuleId?: pulumi.Input<string>;
    /**
     * The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
     */
    readonly sid?: pulumi.Input<string>;
    /**
     * The instance status.
     */
    readonly state?: pulumi.Input<string>;
    /**
     * The tenant ID. 
     */
    readonly tid?: pulumi.Input<number>;
    /**
     * Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
     */
    readonly useDsql?: pulumi.Input<number>;
    /**
     * VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
     */
    readonly vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EnterpriseInstance resource.
 */
export interface EnterpriseInstanceArgs {
    /**
     * Cross-database query datalink name.
     */
    readonly dataLinkName?: pulumi.Input<string>;
    /**
     * Database access password.
     */
    readonly databasePassword: pulumi.Input<string>;
    /**
     * Database access account.
     */
    readonly databaseUser: pulumi.Input<string>;
    readonly dbaId?: pulumi.Input<string>;
    /**
     * The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
     */
    readonly dbaUid: pulumi.Input<number>;
    /**
     * Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
     */
    readonly ddlOnline?: pulumi.Input<number>;
    /**
     * ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
     */
    readonly ecsInstanceId?: pulumi.Input<string>;
    /**
     * The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
     */
    readonly ecsRegion?: pulumi.Input<string>;
    /**
     * Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
     */
    readonly envType: pulumi.Input<string>;
    /**
     * Export timeout, unit: s (seconds).
     */
    readonly exportTimeout: pulumi.Input<number>;
    /**
     * Host address of the target database.
     */
    readonly host: pulumi.Input<string>;
    /**
     * Instance alias, to help users quickly distinguish positioning.
     */
    readonly instanceAlias: pulumi.Input<string>;
    readonly instanceId?: pulumi.Input<string>;
    /**
     * The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
     */
    readonly instanceSource: pulumi.Input<string>;
    /**
     * Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
     */
    readonly instanceType: pulumi.Input<string>;
    /**
     * Network type. Valid values: `CLASSIC`, `VPC`.
     */
    readonly networkType: pulumi.Input<string>;
    /**
     * Access port of the target database.
     */
    readonly port: pulumi.Input<number>;
    /**
     * Query timeout time, unit: s (seconds).
     */
    readonly queryTimeout: pulumi.Input<number>;
    /**
     * The security rule of the instance is passed into the name of the security rule in the enterprise.
     */
    readonly safeRule: pulumi.Input<string>;
    readonly safeRuleId?: pulumi.Input<string>;
    /**
     * The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
     */
    readonly sid?: pulumi.Input<string>;
    /**
     * The tenant ID. 
     */
    readonly tid?: pulumi.Input<number>;
    /**
     * Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
     */
    readonly useDsql?: pulumi.Input<number>;
    /**
     * VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
     */
    readonly vpcId?: pulumi.Input<string>;
}