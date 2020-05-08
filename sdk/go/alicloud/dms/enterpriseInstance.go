// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package dms

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a DMS Enterprise Instance resource.
//
// > **NOTE:** API users must first register in DMS.
// > **NOTE:** Available in 1.81.0+.
type EnterpriseInstance struct {
	pulumi.CustomResourceState

	// Cross-database query datalink name.
	DataLinkName pulumi.StringPtrOutput `pulumi:"dataLinkName"`
	// Database access password.
	DatabasePassword pulumi.StringOutput `pulumi:"databasePassword"`
	// Database access account.
	DatabaseUser pulumi.StringOutput `pulumi:"databaseUser"`
	DbaId        pulumi.StringOutput `pulumi:"dbaId"`
	// The instance dba nickname.
	DbaNickName pulumi.StringOutput `pulumi:"dbaNickName"`
	// The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
	DbaUid pulumi.IntOutput `pulumi:"dbaUid"`
	// Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
	DdlOnline pulumi.IntPtrOutput `pulumi:"ddlOnline"`
	// ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
	EcsInstanceId pulumi.StringOutput `pulumi:"ecsInstanceId"`
	// The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
	EcsRegion pulumi.StringPtrOutput `pulumi:"ecsRegion"`
	// Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
	EnvType pulumi.StringOutput `pulumi:"envType"`
	// Export timeout, unit: s (seconds).
	ExportTimeout pulumi.IntOutput `pulumi:"exportTimeout"`
	// Host address of the target database.
	Host pulumi.StringOutput `pulumi:"host"`
	// Instance alias, to help users quickly distinguish positioning.
	InstanceAlias pulumi.StringOutput `pulumi:"instanceAlias"`
	InstanceId    pulumi.StringOutput `pulumi:"instanceId"`
	// The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
	InstanceSource pulumi.StringOutput `pulumi:"instanceSource"`
	// Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// Network type. Valid values: `CLASSIC`, `VPC`.
	NetworkType pulumi.StringOutput `pulumi:"networkType"`
	// Access port of the target database.
	Port pulumi.IntOutput `pulumi:"port"`
	// Query timeout time, unit: s (seconds).
	QueryTimeout pulumi.IntOutput `pulumi:"queryTimeout"`
	// The security rule of the instance is passed into the name of the security rule in the enterprise.
	SafeRule   pulumi.StringOutput `pulumi:"safeRule"`
	SafeRuleId pulumi.StringOutput `pulumi:"safeRuleId"`
	// The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
	Sid pulumi.StringPtrOutput `pulumi:"sid"`
	// The instance status.
	State pulumi.StringOutput `pulumi:"state"`
	// The tenant ID.
	Tid pulumi.IntPtrOutput `pulumi:"tid"`
	// Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
	UseDsql pulumi.IntPtrOutput `pulumi:"useDsql"`
	// VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
	VpcId pulumi.StringPtrOutput `pulumi:"vpcId"`
}

// NewEnterpriseInstance registers a new resource with the given unique name, arguments, and options.
func NewEnterpriseInstance(ctx *pulumi.Context,
	name string, args *EnterpriseInstanceArgs, opts ...pulumi.ResourceOption) (*EnterpriseInstance, error) {
	if args == nil || args.DatabasePassword == nil {
		return nil, errors.New("missing required argument 'DatabasePassword'")
	}
	if args == nil || args.DatabaseUser == nil {
		return nil, errors.New("missing required argument 'DatabaseUser'")
	}
	if args == nil || args.DbaUid == nil {
		return nil, errors.New("missing required argument 'DbaUid'")
	}
	if args == nil || args.EnvType == nil {
		return nil, errors.New("missing required argument 'EnvType'")
	}
	if args == nil || args.ExportTimeout == nil {
		return nil, errors.New("missing required argument 'ExportTimeout'")
	}
	if args == nil || args.Host == nil {
		return nil, errors.New("missing required argument 'Host'")
	}
	if args == nil || args.InstanceAlias == nil {
		return nil, errors.New("missing required argument 'InstanceAlias'")
	}
	if args == nil || args.InstanceSource == nil {
		return nil, errors.New("missing required argument 'InstanceSource'")
	}
	if args == nil || args.InstanceType == nil {
		return nil, errors.New("missing required argument 'InstanceType'")
	}
	if args == nil || args.NetworkType == nil {
		return nil, errors.New("missing required argument 'NetworkType'")
	}
	if args == nil || args.Port == nil {
		return nil, errors.New("missing required argument 'Port'")
	}
	if args == nil || args.QueryTimeout == nil {
		return nil, errors.New("missing required argument 'QueryTimeout'")
	}
	if args == nil || args.SafeRule == nil {
		return nil, errors.New("missing required argument 'SafeRule'")
	}
	if args == nil {
		args = &EnterpriseInstanceArgs{}
	}
	var resource EnterpriseInstance
	err := ctx.RegisterResource("alicloud:dms/enterpriseInstance:EnterpriseInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnterpriseInstance gets an existing EnterpriseInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnterpriseInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnterpriseInstanceState, opts ...pulumi.ResourceOption) (*EnterpriseInstance, error) {
	var resource EnterpriseInstance
	err := ctx.ReadResource("alicloud:dms/enterpriseInstance:EnterpriseInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnterpriseInstance resources.
type enterpriseInstanceState struct {
	// Cross-database query datalink name.
	DataLinkName *string `pulumi:"dataLinkName"`
	// Database access password.
	DatabasePassword *string `pulumi:"databasePassword"`
	// Database access account.
	DatabaseUser *string `pulumi:"databaseUser"`
	DbaId        *string `pulumi:"dbaId"`
	// The instance dba nickname.
	DbaNickName *string `pulumi:"dbaNickName"`
	// The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
	DbaUid *int `pulumi:"dbaUid"`
	// Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
	DdlOnline *int `pulumi:"ddlOnline"`
	// ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
	EcsInstanceId *string `pulumi:"ecsInstanceId"`
	// The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
	EcsRegion *string `pulumi:"ecsRegion"`
	// Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
	EnvType *string `pulumi:"envType"`
	// Export timeout, unit: s (seconds).
	ExportTimeout *int `pulumi:"exportTimeout"`
	// Host address of the target database.
	Host *string `pulumi:"host"`
	// Instance alias, to help users quickly distinguish positioning.
	InstanceAlias *string `pulumi:"instanceAlias"`
	InstanceId    *string `pulumi:"instanceId"`
	// The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
	InstanceSource *string `pulumi:"instanceSource"`
	// Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
	InstanceType *string `pulumi:"instanceType"`
	// Network type. Valid values: `CLASSIC`, `VPC`.
	NetworkType *string `pulumi:"networkType"`
	// Access port of the target database.
	Port *int `pulumi:"port"`
	// Query timeout time, unit: s (seconds).
	QueryTimeout *int `pulumi:"queryTimeout"`
	// The security rule of the instance is passed into the name of the security rule in the enterprise.
	SafeRule   *string `pulumi:"safeRule"`
	SafeRuleId *string `pulumi:"safeRuleId"`
	// The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
	Sid *string `pulumi:"sid"`
	// The instance status.
	State *string `pulumi:"state"`
	// The tenant ID.
	Tid *int `pulumi:"tid"`
	// Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
	UseDsql *int `pulumi:"useDsql"`
	// VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
	VpcId *string `pulumi:"vpcId"`
}

type EnterpriseInstanceState struct {
	// Cross-database query datalink name.
	DataLinkName pulumi.StringPtrInput
	// Database access password.
	DatabasePassword pulumi.StringPtrInput
	// Database access account.
	DatabaseUser pulumi.StringPtrInput
	DbaId        pulumi.StringPtrInput
	// The instance dba nickname.
	DbaNickName pulumi.StringPtrInput
	// The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
	DbaUid pulumi.IntPtrInput
	// Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
	DdlOnline pulumi.IntPtrInput
	// ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
	EcsInstanceId pulumi.StringPtrInput
	// The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
	EcsRegion pulumi.StringPtrInput
	// Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
	EnvType pulumi.StringPtrInput
	// Export timeout, unit: s (seconds).
	ExportTimeout pulumi.IntPtrInput
	// Host address of the target database.
	Host pulumi.StringPtrInput
	// Instance alias, to help users quickly distinguish positioning.
	InstanceAlias pulumi.StringPtrInput
	InstanceId    pulumi.StringPtrInput
	// The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
	InstanceSource pulumi.StringPtrInput
	// Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
	InstanceType pulumi.StringPtrInput
	// Network type. Valid values: `CLASSIC`, `VPC`.
	NetworkType pulumi.StringPtrInput
	// Access port of the target database.
	Port pulumi.IntPtrInput
	// Query timeout time, unit: s (seconds).
	QueryTimeout pulumi.IntPtrInput
	// The security rule of the instance is passed into the name of the security rule in the enterprise.
	SafeRule   pulumi.StringPtrInput
	SafeRuleId pulumi.StringPtrInput
	// The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
	Sid pulumi.StringPtrInput
	// The instance status.
	State pulumi.StringPtrInput
	// The tenant ID.
	Tid pulumi.IntPtrInput
	// Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
	UseDsql pulumi.IntPtrInput
	// VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
	VpcId pulumi.StringPtrInput
}

func (EnterpriseInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseInstanceState)(nil)).Elem()
}

type enterpriseInstanceArgs struct {
	// Cross-database query datalink name.
	DataLinkName *string `pulumi:"dataLinkName"`
	// Database access password.
	DatabasePassword string `pulumi:"databasePassword"`
	// Database access account.
	DatabaseUser string  `pulumi:"databaseUser"`
	DbaId        *string `pulumi:"dbaId"`
	// The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
	DbaUid int `pulumi:"dbaUid"`
	// Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
	DdlOnline *int `pulumi:"ddlOnline"`
	// ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
	EcsInstanceId *string `pulumi:"ecsInstanceId"`
	// The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
	EcsRegion *string `pulumi:"ecsRegion"`
	// Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
	EnvType string `pulumi:"envType"`
	// Export timeout, unit: s (seconds).
	ExportTimeout int `pulumi:"exportTimeout"`
	// Host address of the target database.
	Host string `pulumi:"host"`
	// Instance alias, to help users quickly distinguish positioning.
	InstanceAlias string  `pulumi:"instanceAlias"`
	InstanceId    *string `pulumi:"instanceId"`
	// The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
	InstanceSource string `pulumi:"instanceSource"`
	// Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
	InstanceType string `pulumi:"instanceType"`
	// Network type. Valid values: `CLASSIC`, `VPC`.
	NetworkType string `pulumi:"networkType"`
	// Access port of the target database.
	Port int `pulumi:"port"`
	// Query timeout time, unit: s (seconds).
	QueryTimeout int `pulumi:"queryTimeout"`
	// The security rule of the instance is passed into the name of the security rule in the enterprise.
	SafeRule   string  `pulumi:"safeRule"`
	SafeRuleId *string `pulumi:"safeRuleId"`
	// The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
	Sid *string `pulumi:"sid"`
	// The tenant ID.
	Tid *int `pulumi:"tid"`
	// Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
	UseDsql *int `pulumi:"useDsql"`
	// VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
	VpcId *string `pulumi:"vpcId"`
}

// The set of arguments for constructing a EnterpriseInstance resource.
type EnterpriseInstanceArgs struct {
	// Cross-database query datalink name.
	DataLinkName pulumi.StringPtrInput
	// Database access password.
	DatabasePassword pulumi.StringInput
	// Database access account.
	DatabaseUser pulumi.StringInput
	DbaId        pulumi.StringPtrInput
	// The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
	DbaUid pulumi.IntInput
	// Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
	DdlOnline pulumi.IntPtrInput
	// ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
	EcsInstanceId pulumi.StringPtrInput
	// The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
	EcsRegion pulumi.StringPtrInput
	// Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
	EnvType pulumi.StringInput
	// Export timeout, unit: s (seconds).
	ExportTimeout pulumi.IntInput
	// Host address of the target database.
	Host pulumi.StringInput
	// Instance alias, to help users quickly distinguish positioning.
	InstanceAlias pulumi.StringInput
	InstanceId    pulumi.StringPtrInput
	// The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
	InstanceSource pulumi.StringInput
	// Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
	InstanceType pulumi.StringInput
	// Network type. Valid values: `CLASSIC`, `VPC`.
	NetworkType pulumi.StringInput
	// Access port of the target database.
	Port pulumi.IntInput
	// Query timeout time, unit: s (seconds).
	QueryTimeout pulumi.IntInput
	// The security rule of the instance is passed into the name of the security rule in the enterprise.
	SafeRule   pulumi.StringInput
	SafeRuleId pulumi.StringPtrInput
	// The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
	Sid pulumi.StringPtrInput
	// The tenant ID.
	Tid pulumi.IntPtrInput
	// Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
	UseDsql pulumi.IntPtrInput
	// VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
	VpcId pulumi.StringPtrInput
}

func (EnterpriseInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseInstanceArgs)(nil)).Elem()
}