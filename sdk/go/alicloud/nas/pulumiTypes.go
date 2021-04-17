// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GetAccessGroupsGroup struct {
	// The name of access group.
	AccessGroupName string `pulumi:"accessGroupName"`
	// Filter results by a specific AccessGroupType.
	AccessGroupType string `pulumi:"accessGroupType"`
	// Filter results by a specific Description.
	Description string `pulumi:"description"`
	// This ID of this AccessGroup. It is formatted to ``<access_group_id>:<file_system_type>``. Before version 1.95.0, the value is `accessGroupName`.
	Id string `pulumi:"id"`
	// MountTargetCount block of the AccessGroup
	MountTargetCount int `pulumi:"mountTargetCount"`
	// RuleCount of the AccessGroup.
	RuleCount int `pulumi:"ruleCount"`
	// Field `type` has been deprecated from version 1.95.0. Use `accessGroupType` instead.
	Type string `pulumi:"type"`
}

// GetAccessGroupsGroupInput is an input type that accepts GetAccessGroupsGroupArgs and GetAccessGroupsGroupOutput values.
// You can construct a concrete instance of `GetAccessGroupsGroupInput` via:
//
//          GetAccessGroupsGroupArgs{...}
type GetAccessGroupsGroupInput interface {
	pulumi.Input

	ToGetAccessGroupsGroupOutput() GetAccessGroupsGroupOutput
	ToGetAccessGroupsGroupOutputWithContext(context.Context) GetAccessGroupsGroupOutput
}

type GetAccessGroupsGroupArgs struct {
	// The name of access group.
	AccessGroupName pulumi.StringInput `pulumi:"accessGroupName"`
	// Filter results by a specific AccessGroupType.
	AccessGroupType pulumi.StringInput `pulumi:"accessGroupType"`
	// Filter results by a specific Description.
	Description pulumi.StringInput `pulumi:"description"`
	// This ID of this AccessGroup. It is formatted to ``<access_group_id>:<file_system_type>``. Before version 1.95.0, the value is `accessGroupName`.
	Id pulumi.StringInput `pulumi:"id"`
	// MountTargetCount block of the AccessGroup
	MountTargetCount pulumi.IntInput `pulumi:"mountTargetCount"`
	// RuleCount of the AccessGroup.
	RuleCount pulumi.IntInput `pulumi:"ruleCount"`
	// Field `type` has been deprecated from version 1.95.0. Use `accessGroupType` instead.
	Type pulumi.StringInput `pulumi:"type"`
}

func (GetAccessGroupsGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessGroupsGroup)(nil)).Elem()
}

func (i GetAccessGroupsGroupArgs) ToGetAccessGroupsGroupOutput() GetAccessGroupsGroupOutput {
	return i.ToGetAccessGroupsGroupOutputWithContext(context.Background())
}

func (i GetAccessGroupsGroupArgs) ToGetAccessGroupsGroupOutputWithContext(ctx context.Context) GetAccessGroupsGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAccessGroupsGroupOutput)
}

// GetAccessGroupsGroupArrayInput is an input type that accepts GetAccessGroupsGroupArray and GetAccessGroupsGroupArrayOutput values.
// You can construct a concrete instance of `GetAccessGroupsGroupArrayInput` via:
//
//          GetAccessGroupsGroupArray{ GetAccessGroupsGroupArgs{...} }
type GetAccessGroupsGroupArrayInput interface {
	pulumi.Input

	ToGetAccessGroupsGroupArrayOutput() GetAccessGroupsGroupArrayOutput
	ToGetAccessGroupsGroupArrayOutputWithContext(context.Context) GetAccessGroupsGroupArrayOutput
}

type GetAccessGroupsGroupArray []GetAccessGroupsGroupInput

func (GetAccessGroupsGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAccessGroupsGroup)(nil)).Elem()
}

func (i GetAccessGroupsGroupArray) ToGetAccessGroupsGroupArrayOutput() GetAccessGroupsGroupArrayOutput {
	return i.ToGetAccessGroupsGroupArrayOutputWithContext(context.Background())
}

func (i GetAccessGroupsGroupArray) ToGetAccessGroupsGroupArrayOutputWithContext(ctx context.Context) GetAccessGroupsGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAccessGroupsGroupArrayOutput)
}

type GetAccessGroupsGroupOutput struct{ *pulumi.OutputState }

func (GetAccessGroupsGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessGroupsGroup)(nil)).Elem()
}

func (o GetAccessGroupsGroupOutput) ToGetAccessGroupsGroupOutput() GetAccessGroupsGroupOutput {
	return o
}

func (o GetAccessGroupsGroupOutput) ToGetAccessGroupsGroupOutputWithContext(ctx context.Context) GetAccessGroupsGroupOutput {
	return o
}

// The name of access group.
func (o GetAccessGroupsGroupOutput) AccessGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessGroupsGroup) string { return v.AccessGroupName }).(pulumi.StringOutput)
}

// Filter results by a specific AccessGroupType.
func (o GetAccessGroupsGroupOutput) AccessGroupType() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessGroupsGroup) string { return v.AccessGroupType }).(pulumi.StringOutput)
}

// Filter results by a specific Description.
func (o GetAccessGroupsGroupOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessGroupsGroup) string { return v.Description }).(pulumi.StringOutput)
}

// This ID of this AccessGroup. It is formatted to ``<access_group_id>:<file_system_type>``. Before version 1.95.0, the value is `accessGroupName`.
func (o GetAccessGroupsGroupOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessGroupsGroup) string { return v.Id }).(pulumi.StringOutput)
}

// MountTargetCount block of the AccessGroup
func (o GetAccessGroupsGroupOutput) MountTargetCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetAccessGroupsGroup) int { return v.MountTargetCount }).(pulumi.IntOutput)
}

// RuleCount of the AccessGroup.
func (o GetAccessGroupsGroupOutput) RuleCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetAccessGroupsGroup) int { return v.RuleCount }).(pulumi.IntOutput)
}

// Field `type` has been deprecated from version 1.95.0. Use `accessGroupType` instead.
func (o GetAccessGroupsGroupOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessGroupsGroup) string { return v.Type }).(pulumi.StringOutput)
}

type GetAccessGroupsGroupArrayOutput struct{ *pulumi.OutputState }

func (GetAccessGroupsGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAccessGroupsGroup)(nil)).Elem()
}

func (o GetAccessGroupsGroupArrayOutput) ToGetAccessGroupsGroupArrayOutput() GetAccessGroupsGroupArrayOutput {
	return o
}

func (o GetAccessGroupsGroupArrayOutput) ToGetAccessGroupsGroupArrayOutputWithContext(ctx context.Context) GetAccessGroupsGroupArrayOutput {
	return o
}

func (o GetAccessGroupsGroupArrayOutput) Index(i pulumi.IntInput) GetAccessGroupsGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAccessGroupsGroup {
		return vs[0].([]GetAccessGroupsGroup)[vs[1].(int)]
	}).(GetAccessGroupsGroupOutput)
}

type GetAccessRulesRule struct {
	// AccessRuleId of the AccessRule.
	AccessRuleId string `pulumi:"accessRuleId"`
	// Priority of the AccessRule.
	Priority int `pulumi:"priority"`
	// Filter results by a specific RWAccess.
	RwAccess string `pulumi:"rwAccess"`
	// Filter results by a specific SourceCidrIp.
	SourceCidrIp string `pulumi:"sourceCidrIp"`
	// Filter results by a specific UserAccess.
	UserAccess string `pulumi:"userAccess"`
}

// GetAccessRulesRuleInput is an input type that accepts GetAccessRulesRuleArgs and GetAccessRulesRuleOutput values.
// You can construct a concrete instance of `GetAccessRulesRuleInput` via:
//
//          GetAccessRulesRuleArgs{...}
type GetAccessRulesRuleInput interface {
	pulumi.Input

	ToGetAccessRulesRuleOutput() GetAccessRulesRuleOutput
	ToGetAccessRulesRuleOutputWithContext(context.Context) GetAccessRulesRuleOutput
}

type GetAccessRulesRuleArgs struct {
	// AccessRuleId of the AccessRule.
	AccessRuleId pulumi.StringInput `pulumi:"accessRuleId"`
	// Priority of the AccessRule.
	Priority pulumi.IntInput `pulumi:"priority"`
	// Filter results by a specific RWAccess.
	RwAccess pulumi.StringInput `pulumi:"rwAccess"`
	// Filter results by a specific SourceCidrIp.
	SourceCidrIp pulumi.StringInput `pulumi:"sourceCidrIp"`
	// Filter results by a specific UserAccess.
	UserAccess pulumi.StringInput `pulumi:"userAccess"`
}

func (GetAccessRulesRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessRulesRule)(nil)).Elem()
}

func (i GetAccessRulesRuleArgs) ToGetAccessRulesRuleOutput() GetAccessRulesRuleOutput {
	return i.ToGetAccessRulesRuleOutputWithContext(context.Background())
}

func (i GetAccessRulesRuleArgs) ToGetAccessRulesRuleOutputWithContext(ctx context.Context) GetAccessRulesRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAccessRulesRuleOutput)
}

// GetAccessRulesRuleArrayInput is an input type that accepts GetAccessRulesRuleArray and GetAccessRulesRuleArrayOutput values.
// You can construct a concrete instance of `GetAccessRulesRuleArrayInput` via:
//
//          GetAccessRulesRuleArray{ GetAccessRulesRuleArgs{...} }
type GetAccessRulesRuleArrayInput interface {
	pulumi.Input

	ToGetAccessRulesRuleArrayOutput() GetAccessRulesRuleArrayOutput
	ToGetAccessRulesRuleArrayOutputWithContext(context.Context) GetAccessRulesRuleArrayOutput
}

type GetAccessRulesRuleArray []GetAccessRulesRuleInput

func (GetAccessRulesRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAccessRulesRule)(nil)).Elem()
}

func (i GetAccessRulesRuleArray) ToGetAccessRulesRuleArrayOutput() GetAccessRulesRuleArrayOutput {
	return i.ToGetAccessRulesRuleArrayOutputWithContext(context.Background())
}

func (i GetAccessRulesRuleArray) ToGetAccessRulesRuleArrayOutputWithContext(ctx context.Context) GetAccessRulesRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAccessRulesRuleArrayOutput)
}

type GetAccessRulesRuleOutput struct{ *pulumi.OutputState }

func (GetAccessRulesRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessRulesRule)(nil)).Elem()
}

func (o GetAccessRulesRuleOutput) ToGetAccessRulesRuleOutput() GetAccessRulesRuleOutput {
	return o
}

func (o GetAccessRulesRuleOutput) ToGetAccessRulesRuleOutputWithContext(ctx context.Context) GetAccessRulesRuleOutput {
	return o
}

// AccessRuleId of the AccessRule.
func (o GetAccessRulesRuleOutput) AccessRuleId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessRulesRule) string { return v.AccessRuleId }).(pulumi.StringOutput)
}

// Priority of the AccessRule.
func (o GetAccessRulesRuleOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v GetAccessRulesRule) int { return v.Priority }).(pulumi.IntOutput)
}

// Filter results by a specific RWAccess.
func (o GetAccessRulesRuleOutput) RwAccess() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessRulesRule) string { return v.RwAccess }).(pulumi.StringOutput)
}

// Filter results by a specific SourceCidrIp.
func (o GetAccessRulesRuleOutput) SourceCidrIp() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessRulesRule) string { return v.SourceCidrIp }).(pulumi.StringOutput)
}

// Filter results by a specific UserAccess.
func (o GetAccessRulesRuleOutput) UserAccess() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessRulesRule) string { return v.UserAccess }).(pulumi.StringOutput)
}

type GetAccessRulesRuleArrayOutput struct{ *pulumi.OutputState }

func (GetAccessRulesRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAccessRulesRule)(nil)).Elem()
}

func (o GetAccessRulesRuleArrayOutput) ToGetAccessRulesRuleArrayOutput() GetAccessRulesRuleArrayOutput {
	return o
}

func (o GetAccessRulesRuleArrayOutput) ToGetAccessRulesRuleArrayOutputWithContext(ctx context.Context) GetAccessRulesRuleArrayOutput {
	return o
}

func (o GetAccessRulesRuleArrayOutput) Index(i pulumi.IntInput) GetAccessRulesRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAccessRulesRule {
		return vs[0].([]GetAccessRulesRule)[vs[1].(int)]
	}).(GetAccessRulesRuleOutput)
}

type GetFileSystemsSystem struct {
	// Time of creation.
	CreateTime string `pulumi:"createTime"`
	// Destription of the FileSystem.
	Description string `pulumi:"description"`
	// ID of the FileSystem.
	Id string `pulumi:"id"`
	// MeteredSize of the FileSystem.
	MeteredSize int `pulumi:"meteredSize"`
	// Filter results by a specific ProtocolType. Valid values: `NFS` and `SMB`.
	ProtocolType string `pulumi:"protocolType"`
	// ID of the region where the FileSystem is located.
	RegionId string `pulumi:"regionId"`
	// Filter results by a specific StorageType. Valid values: `Capacity` and `Performance`.
	StorageType string `pulumi:"storageType"`
}

// GetFileSystemsSystemInput is an input type that accepts GetFileSystemsSystemArgs and GetFileSystemsSystemOutput values.
// You can construct a concrete instance of `GetFileSystemsSystemInput` via:
//
//          GetFileSystemsSystemArgs{...}
type GetFileSystemsSystemInput interface {
	pulumi.Input

	ToGetFileSystemsSystemOutput() GetFileSystemsSystemOutput
	ToGetFileSystemsSystemOutputWithContext(context.Context) GetFileSystemsSystemOutput
}

type GetFileSystemsSystemArgs struct {
	// Time of creation.
	CreateTime pulumi.StringInput `pulumi:"createTime"`
	// Destription of the FileSystem.
	Description pulumi.StringInput `pulumi:"description"`
	// ID of the FileSystem.
	Id pulumi.StringInput `pulumi:"id"`
	// MeteredSize of the FileSystem.
	MeteredSize pulumi.IntInput `pulumi:"meteredSize"`
	// Filter results by a specific ProtocolType. Valid values: `NFS` and `SMB`.
	ProtocolType pulumi.StringInput `pulumi:"protocolType"`
	// ID of the region where the FileSystem is located.
	RegionId pulumi.StringInput `pulumi:"regionId"`
	// Filter results by a specific StorageType. Valid values: `Capacity` and `Performance`.
	StorageType pulumi.StringInput `pulumi:"storageType"`
}

func (GetFileSystemsSystemArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileSystemsSystem)(nil)).Elem()
}

func (i GetFileSystemsSystemArgs) ToGetFileSystemsSystemOutput() GetFileSystemsSystemOutput {
	return i.ToGetFileSystemsSystemOutputWithContext(context.Background())
}

func (i GetFileSystemsSystemArgs) ToGetFileSystemsSystemOutputWithContext(ctx context.Context) GetFileSystemsSystemOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetFileSystemsSystemOutput)
}

// GetFileSystemsSystemArrayInput is an input type that accepts GetFileSystemsSystemArray and GetFileSystemsSystemArrayOutput values.
// You can construct a concrete instance of `GetFileSystemsSystemArrayInput` via:
//
//          GetFileSystemsSystemArray{ GetFileSystemsSystemArgs{...} }
type GetFileSystemsSystemArrayInput interface {
	pulumi.Input

	ToGetFileSystemsSystemArrayOutput() GetFileSystemsSystemArrayOutput
	ToGetFileSystemsSystemArrayOutputWithContext(context.Context) GetFileSystemsSystemArrayOutput
}

type GetFileSystemsSystemArray []GetFileSystemsSystemInput

func (GetFileSystemsSystemArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetFileSystemsSystem)(nil)).Elem()
}

func (i GetFileSystemsSystemArray) ToGetFileSystemsSystemArrayOutput() GetFileSystemsSystemArrayOutput {
	return i.ToGetFileSystemsSystemArrayOutputWithContext(context.Background())
}

func (i GetFileSystemsSystemArray) ToGetFileSystemsSystemArrayOutputWithContext(ctx context.Context) GetFileSystemsSystemArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetFileSystemsSystemArrayOutput)
}

type GetFileSystemsSystemOutput struct{ *pulumi.OutputState }

func (GetFileSystemsSystemOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileSystemsSystem)(nil)).Elem()
}

func (o GetFileSystemsSystemOutput) ToGetFileSystemsSystemOutput() GetFileSystemsSystemOutput {
	return o
}

func (o GetFileSystemsSystemOutput) ToGetFileSystemsSystemOutputWithContext(ctx context.Context) GetFileSystemsSystemOutput {
	return o
}

// Time of creation.
func (o GetFileSystemsSystemOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileSystemsSystem) string { return v.CreateTime }).(pulumi.StringOutput)
}

// Destription of the FileSystem.
func (o GetFileSystemsSystemOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileSystemsSystem) string { return v.Description }).(pulumi.StringOutput)
}

// ID of the FileSystem.
func (o GetFileSystemsSystemOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileSystemsSystem) string { return v.Id }).(pulumi.StringOutput)
}

// MeteredSize of the FileSystem.
func (o GetFileSystemsSystemOutput) MeteredSize() pulumi.IntOutput {
	return o.ApplyT(func(v GetFileSystemsSystem) int { return v.MeteredSize }).(pulumi.IntOutput)
}

// Filter results by a specific ProtocolType. Valid values: `NFS` and `SMB`.
func (o GetFileSystemsSystemOutput) ProtocolType() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileSystemsSystem) string { return v.ProtocolType }).(pulumi.StringOutput)
}

// ID of the region where the FileSystem is located.
func (o GetFileSystemsSystemOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileSystemsSystem) string { return v.RegionId }).(pulumi.StringOutput)
}

// Filter results by a specific StorageType. Valid values: `Capacity` and `Performance`.
func (o GetFileSystemsSystemOutput) StorageType() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileSystemsSystem) string { return v.StorageType }).(pulumi.StringOutput)
}

type GetFileSystemsSystemArrayOutput struct{ *pulumi.OutputState }

func (GetFileSystemsSystemArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetFileSystemsSystem)(nil)).Elem()
}

func (o GetFileSystemsSystemArrayOutput) ToGetFileSystemsSystemArrayOutput() GetFileSystemsSystemArrayOutput {
	return o
}

func (o GetFileSystemsSystemArrayOutput) ToGetFileSystemsSystemArrayOutputWithContext(ctx context.Context) GetFileSystemsSystemArrayOutput {
	return o
}

func (o GetFileSystemsSystemArrayOutput) Index(i pulumi.IntInput) GetFileSystemsSystemOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetFileSystemsSystem {
		return vs[0].([]GetFileSystemsSystem)[vs[1].(int)]
	}).(GetFileSystemsSystemOutput)
}

type GetMountTargetsTarget struct {
	// Filter results by a specific AccessGroupName.
	AccessGroupName string `pulumi:"accessGroupName"`
	// ID of the MountTargetDomain.
	Id string `pulumi:"id"`
	// Field `mountTargetDomain` has been deprecated from provider version 1.53.0. New field `ids` replaces it.
	MountTargetDomain string `pulumi:"mountTargetDomain"`
	// Filter results by a specific NetworkType.
	NetworkType string `pulumi:"networkType"`
	// Filter results by the status of mount target. Valid values: `Active`, `Inactive` and `Pending`.
	Status string `pulumi:"status"`
	// Field `type` has been deprecated from provider version 1.95.0. New field `networkType` replaces it.
	Type string `pulumi:"type"`
	// Filter results by a specific VpcId.
	VpcId string `pulumi:"vpcId"`
	// Filter results by a specific VSwitchId.
	VswitchId string `pulumi:"vswitchId"`
}

// GetMountTargetsTargetInput is an input type that accepts GetMountTargetsTargetArgs and GetMountTargetsTargetOutput values.
// You can construct a concrete instance of `GetMountTargetsTargetInput` via:
//
//          GetMountTargetsTargetArgs{...}
type GetMountTargetsTargetInput interface {
	pulumi.Input

	ToGetMountTargetsTargetOutput() GetMountTargetsTargetOutput
	ToGetMountTargetsTargetOutputWithContext(context.Context) GetMountTargetsTargetOutput
}

type GetMountTargetsTargetArgs struct {
	// Filter results by a specific AccessGroupName.
	AccessGroupName pulumi.StringInput `pulumi:"accessGroupName"`
	// ID of the MountTargetDomain.
	Id pulumi.StringInput `pulumi:"id"`
	// Field `mountTargetDomain` has been deprecated from provider version 1.53.0. New field `ids` replaces it.
	MountTargetDomain pulumi.StringInput `pulumi:"mountTargetDomain"`
	// Filter results by a specific NetworkType.
	NetworkType pulumi.StringInput `pulumi:"networkType"`
	// Filter results by the status of mount target. Valid values: `Active`, `Inactive` and `Pending`.
	Status pulumi.StringInput `pulumi:"status"`
	// Field `type` has been deprecated from provider version 1.95.0. New field `networkType` replaces it.
	Type pulumi.StringInput `pulumi:"type"`
	// Filter results by a specific VpcId.
	VpcId pulumi.StringInput `pulumi:"vpcId"`
	// Filter results by a specific VSwitchId.
	VswitchId pulumi.StringInput `pulumi:"vswitchId"`
}

func (GetMountTargetsTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMountTargetsTarget)(nil)).Elem()
}

func (i GetMountTargetsTargetArgs) ToGetMountTargetsTargetOutput() GetMountTargetsTargetOutput {
	return i.ToGetMountTargetsTargetOutputWithContext(context.Background())
}

func (i GetMountTargetsTargetArgs) ToGetMountTargetsTargetOutputWithContext(ctx context.Context) GetMountTargetsTargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetMountTargetsTargetOutput)
}

// GetMountTargetsTargetArrayInput is an input type that accepts GetMountTargetsTargetArray and GetMountTargetsTargetArrayOutput values.
// You can construct a concrete instance of `GetMountTargetsTargetArrayInput` via:
//
//          GetMountTargetsTargetArray{ GetMountTargetsTargetArgs{...} }
type GetMountTargetsTargetArrayInput interface {
	pulumi.Input

	ToGetMountTargetsTargetArrayOutput() GetMountTargetsTargetArrayOutput
	ToGetMountTargetsTargetArrayOutputWithContext(context.Context) GetMountTargetsTargetArrayOutput
}

type GetMountTargetsTargetArray []GetMountTargetsTargetInput

func (GetMountTargetsTargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetMountTargetsTarget)(nil)).Elem()
}

func (i GetMountTargetsTargetArray) ToGetMountTargetsTargetArrayOutput() GetMountTargetsTargetArrayOutput {
	return i.ToGetMountTargetsTargetArrayOutputWithContext(context.Background())
}

func (i GetMountTargetsTargetArray) ToGetMountTargetsTargetArrayOutputWithContext(ctx context.Context) GetMountTargetsTargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetMountTargetsTargetArrayOutput)
}

type GetMountTargetsTargetOutput struct{ *pulumi.OutputState }

func (GetMountTargetsTargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMountTargetsTarget)(nil)).Elem()
}

func (o GetMountTargetsTargetOutput) ToGetMountTargetsTargetOutput() GetMountTargetsTargetOutput {
	return o
}

func (o GetMountTargetsTargetOutput) ToGetMountTargetsTargetOutputWithContext(ctx context.Context) GetMountTargetsTargetOutput {
	return o
}

// Filter results by a specific AccessGroupName.
func (o GetMountTargetsTargetOutput) AccessGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetMountTargetsTarget) string { return v.AccessGroupName }).(pulumi.StringOutput)
}

// ID of the MountTargetDomain.
func (o GetMountTargetsTargetOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMountTargetsTarget) string { return v.Id }).(pulumi.StringOutput)
}

// Field `mountTargetDomain` has been deprecated from provider version 1.53.0. New field `ids` replaces it.
func (o GetMountTargetsTargetOutput) MountTargetDomain() pulumi.StringOutput {
	return o.ApplyT(func(v GetMountTargetsTarget) string { return v.MountTargetDomain }).(pulumi.StringOutput)
}

// Filter results by a specific NetworkType.
func (o GetMountTargetsTargetOutput) NetworkType() pulumi.StringOutput {
	return o.ApplyT(func(v GetMountTargetsTarget) string { return v.NetworkType }).(pulumi.StringOutput)
}

// Filter results by the status of mount target. Valid values: `Active`, `Inactive` and `Pending`.
func (o GetMountTargetsTargetOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetMountTargetsTarget) string { return v.Status }).(pulumi.StringOutput)
}

// Field `type` has been deprecated from provider version 1.95.0. New field `networkType` replaces it.
func (o GetMountTargetsTargetOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetMountTargetsTarget) string { return v.Type }).(pulumi.StringOutput)
}

// Filter results by a specific VpcId.
func (o GetMountTargetsTargetOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v GetMountTargetsTarget) string { return v.VpcId }).(pulumi.StringOutput)
}

// Filter results by a specific VSwitchId.
func (o GetMountTargetsTargetOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v GetMountTargetsTarget) string { return v.VswitchId }).(pulumi.StringOutput)
}

type GetMountTargetsTargetArrayOutput struct{ *pulumi.OutputState }

func (GetMountTargetsTargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetMountTargetsTarget)(nil)).Elem()
}

func (o GetMountTargetsTargetArrayOutput) ToGetMountTargetsTargetArrayOutput() GetMountTargetsTargetArrayOutput {
	return o
}

func (o GetMountTargetsTargetArrayOutput) ToGetMountTargetsTargetArrayOutputWithContext(ctx context.Context) GetMountTargetsTargetArrayOutput {
	return o
}

func (o GetMountTargetsTargetArrayOutput) Index(i pulumi.IntInput) GetMountTargetsTargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetMountTargetsTarget {
		return vs[0].([]GetMountTargetsTarget)[vs[1].(int)]
	}).(GetMountTargetsTargetOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccessGroupsGroupOutput{})
	pulumi.RegisterOutputType(GetAccessGroupsGroupArrayOutput{})
	pulumi.RegisterOutputType(GetAccessRulesRuleOutput{})
	pulumi.RegisterOutputType(GetAccessRulesRuleArrayOutput{})
	pulumi.RegisterOutputType(GetFileSystemsSystemOutput{})
	pulumi.RegisterOutputType(GetFileSystemsSystemArrayOutput{})
	pulumi.RegisterOutputType(GetMountTargetsTargetOutput{})
	pulumi.RegisterOutputType(GetMountTargetsTargetArrayOutput{})
}
