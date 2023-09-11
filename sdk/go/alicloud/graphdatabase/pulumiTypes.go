// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package graphdatabase

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

var _ = internal.GetEnvOrDefault

type DbInstanceDbInstanceIpArray struct {
	// The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
	DbInstanceIpArrayAttribute *string `pulumi:"dbInstanceIpArrayAttribute"`
	// IP ADDRESS whitelist group name.
	DbInstanceIpArrayName *string `pulumi:"dbInstanceIpArrayName"`
	// IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
	SecurityIps *string `pulumi:"securityIps"`
}

// DbInstanceDbInstanceIpArrayInput is an input type that accepts DbInstanceDbInstanceIpArray and DbInstanceDbInstanceIpArrayOutput values.
// You can construct a concrete instance of `DbInstanceDbInstanceIpArrayInput` via:
//
//	DbInstanceDbInstanceIpArray{ DbInstanceDbInstanceIpArgs{...} }
type DbInstanceDbInstanceIpArrayInput interface {
	pulumi.Input

	ToDbInstanceDbInstanceIpArrayOutput() DbInstanceDbInstanceIpArrayOutput
	ToDbInstanceDbInstanceIpArrayOutputWithContext(context.Context) DbInstanceDbInstanceIpArrayOutput
}

type DbInstanceDbInstanceIpArrayArgs struct {
	// The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
	DbInstanceIpArrayAttribute pulumi.StringPtrInput `pulumi:"dbInstanceIpArrayAttribute"`
	// IP ADDRESS whitelist group name.
	DbInstanceIpArrayName pulumi.StringPtrInput `pulumi:"dbInstanceIpArrayName"`
	// IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
	SecurityIps pulumi.StringPtrInput `pulumi:"securityIps"`
}

func (DbInstanceDbInstanceIpArrayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*DbInstanceDbInstanceIpArray)(nil)).Elem()
}

func (i DbInstanceDbInstanceIpArrayArgs) ToDbInstanceDbInstanceIpArrayOutput() DbInstanceDbInstanceIpArrayOutput {
	return i.ToDbInstanceDbInstanceIpArrayOutputWithContext(context.Background())
}

func (i DbInstanceDbInstanceIpArrayArgs) ToDbInstanceDbInstanceIpArrayOutputWithContext(ctx context.Context) DbInstanceDbInstanceIpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceDbInstanceIpArrayOutput)
}

func (i DbInstanceDbInstanceIpArrayArgs) ToOutput(ctx context.Context) pulumix.Output[DbInstanceDbInstanceIpArray] {
	return pulumix.Output[DbInstanceDbInstanceIpArray]{
		OutputState: i.ToDbInstanceDbInstanceIpArrayOutputWithContext(ctx).OutputState,
	}
}

// DbInstanceDbInstanceIpArrayArrayInput is an input type that accepts DbInstanceDbInstanceIpArrayArray and DbInstanceDbInstanceIpArrayArrayOutput values.
// You can construct a concrete instance of `DbInstanceDbInstanceIpArrayArrayInput` via:
//
//	DbInstanceDbInstanceIpArrayArray{ DbInstanceDbInstanceIpArrayArgs{...} }
type DbInstanceDbInstanceIpArrayArrayInput interface {
	pulumi.Input

	ToDbInstanceDbInstanceIpArrayArrayOutput() DbInstanceDbInstanceIpArrayArrayOutput
	ToDbInstanceDbInstanceIpArrayArrayOutputWithContext(context.Context) DbInstanceDbInstanceIpArrayArrayOutput
}

type DbInstanceDbInstanceIpArrayArray []DbInstanceDbInstanceIpArrayInput

func (DbInstanceDbInstanceIpArrayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DbInstanceDbInstanceIpArray)(nil)).Elem()
}

func (i DbInstanceDbInstanceIpArrayArray) ToDbInstanceDbInstanceIpArrayArrayOutput() DbInstanceDbInstanceIpArrayArrayOutput {
	return i.ToDbInstanceDbInstanceIpArrayArrayOutputWithContext(context.Background())
}

func (i DbInstanceDbInstanceIpArrayArray) ToDbInstanceDbInstanceIpArrayArrayOutputWithContext(ctx context.Context) DbInstanceDbInstanceIpArrayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbInstanceDbInstanceIpArrayArrayOutput)
}

func (i DbInstanceDbInstanceIpArrayArray) ToOutput(ctx context.Context) pulumix.Output[[]DbInstanceDbInstanceIpArray] {
	return pulumix.Output[[]DbInstanceDbInstanceIpArray]{
		OutputState: i.ToDbInstanceDbInstanceIpArrayArrayOutputWithContext(ctx).OutputState,
	}
}

type DbInstanceDbInstanceIpArrayOutput struct{ *pulumi.OutputState }

func (DbInstanceDbInstanceIpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DbInstanceDbInstanceIpArray)(nil)).Elem()
}

func (o DbInstanceDbInstanceIpArrayOutput) ToDbInstanceDbInstanceIpArrayOutput() DbInstanceDbInstanceIpArrayOutput {
	return o
}

func (o DbInstanceDbInstanceIpArrayOutput) ToDbInstanceDbInstanceIpArrayOutputWithContext(ctx context.Context) DbInstanceDbInstanceIpArrayOutput {
	return o
}

func (o DbInstanceDbInstanceIpArrayOutput) ToOutput(ctx context.Context) pulumix.Output[DbInstanceDbInstanceIpArray] {
	return pulumix.Output[DbInstanceDbInstanceIpArray]{
		OutputState: o.OutputState,
	}
}

// The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
func (o DbInstanceDbInstanceIpArrayOutput) DbInstanceIpArrayAttribute() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DbInstanceDbInstanceIpArray) *string { return v.DbInstanceIpArrayAttribute }).(pulumi.StringPtrOutput)
}

// IP ADDRESS whitelist group name.
func (o DbInstanceDbInstanceIpArrayOutput) DbInstanceIpArrayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DbInstanceDbInstanceIpArray) *string { return v.DbInstanceIpArrayName }).(pulumi.StringPtrOutput)
}

// IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
func (o DbInstanceDbInstanceIpArrayOutput) SecurityIps() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DbInstanceDbInstanceIpArray) *string { return v.SecurityIps }).(pulumi.StringPtrOutput)
}

type DbInstanceDbInstanceIpArrayArrayOutput struct{ *pulumi.OutputState }

func (DbInstanceDbInstanceIpArrayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DbInstanceDbInstanceIpArray)(nil)).Elem()
}

func (o DbInstanceDbInstanceIpArrayArrayOutput) ToDbInstanceDbInstanceIpArrayArrayOutput() DbInstanceDbInstanceIpArrayArrayOutput {
	return o
}

func (o DbInstanceDbInstanceIpArrayArrayOutput) ToDbInstanceDbInstanceIpArrayArrayOutputWithContext(ctx context.Context) DbInstanceDbInstanceIpArrayArrayOutput {
	return o
}

func (o DbInstanceDbInstanceIpArrayArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]DbInstanceDbInstanceIpArray] {
	return pulumix.Output[[]DbInstanceDbInstanceIpArray]{
		OutputState: o.OutputState,
	}
}

func (o DbInstanceDbInstanceIpArrayArrayOutput) Index(i pulumi.IntInput) DbInstanceDbInstanceIpArrayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DbInstanceDbInstanceIpArray {
		return vs[0].([]DbInstanceDbInstanceIpArray)[vs[1].(int)]
	}).(DbInstanceDbInstanceIpArrayOutput)
}

type GetDbInstancesInstance struct {
	// Virtual Private Cloud (vpc connection such as a VPN connection or leased line domain name).
	ConnectionString string `pulumi:"connectionString"`
	// Creation time, which follows the format of `YYYY-MM-DD 'T'hh:mm:ssZ`, such as `2011-05-30 T12:11:4Z`.
	CreateTime string `pulumi:"createTime"`
	// The current kernel image version.
	CurrentMinorVersion string `pulumi:"currentMinorVersion"`
	// The category of the db instance.
	DbInstanceCategory string `pulumi:"dbInstanceCategory"`
	// For example, instances can be grouped according to Cpu core count.
	DbInstanceCpu string `pulumi:"dbInstanceCpu"`
	// According to the practical example or notes.
	DbInstanceDescription string `pulumi:"dbInstanceDescription"`
	// The ID of the instance.
	DbInstanceId string `pulumi:"dbInstanceId"`
	// IP ADDRESS whitelist for the instance group list.
	DbInstanceIpArrays []GetDbInstancesInstanceDbInstanceIpArray `pulumi:"dbInstanceIpArrays"`
	// Instance memory, which is measured in MB.
	DbInstanceMemory string `pulumi:"dbInstanceMemory"`
	// The network type of the db instance.
	DbInstanceNetworkType string `pulumi:"dbInstanceNetworkType"`
	// Disk storage type. Valid values: `cloudEssd`, `cloudSsd`.
	DbInstanceStorageType string `pulumi:"dbInstanceStorageType"`
	// The type of the db instance.
	DbInstanceType string `pulumi:"dbInstanceType"`
	// The class of the db node.
	DbNodeClass string `pulumi:"dbNodeClass"`
	// The count of the db node.
	DbNodeCount string `pulumi:"dbNodeCount"`
	// Instance storage space, which is measured in GB.
	DbNodeStorage string `pulumi:"dbNodeStorage"`
	// Kernel Version. Value range: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
	DbVersion string `pulumi:"dbVersion"`
	// The instance after it expires time for subscription instance.
	ExpireTime string `pulumi:"expireTime"`
	// The expire status of the db instance.
	Expired string `pulumi:"expired"`
	// The ID of the Db Instance.
	Id string `pulumi:"id"`
	// The latest kernel image version.
	LatestMinorVersion string `pulumi:"latestMinorVersion"`
	// Instance lock state. Value range: `Unlock`, `ManualLock`, `LockByExpiration`, `LockByRestoration` and `LockByDiskQuota`. `Unlock`: normal. `ManualLock`: the manual trigger lock. `LockByExpiration`: that represents the instance expires automatically lock. `LockByRestoration`: indicates that the instance rollback before auto-lock. `LockByDiskQuota`: that represents the instance space full automatic lock.
	LockMode string `pulumi:"lockMode"`
	// An instance is locked the reason.
	LockReason string `pulumi:"lockReason"`
	// Instance maintenance time such as `00:00Z-02:00Z`, 0 to 2 points to carry out routine maintenance.
	MaintainTime string `pulumi:"maintainTime"`
	// The master instance ID of the db instance.
	MasterDbInstanceId string `pulumi:"masterDbInstanceId"`
	// The paymen type of the resource.
	PaymentType string `pulumi:"paymentType"`
	// Application Port.
	Port int `pulumi:"port"`
	// The public connection string ID of the resource.
	PublicConnectionString string `pulumi:"publicConnectionString"`
	// The public port ID of the resource.
	PublicPort int `pulumi:"publicPort"`
	// The array of the readonly db instances.
	ReadOnlyDbInstanceIds []string `pulumi:"readOnlyDbInstanceIds"`
	// Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
	Status string `pulumi:"status"`
	// The vpc id of the db instance.
	VpcId string `pulumi:"vpcId"`
	// The vswitch id.
	VswitchId string `pulumi:"vswitchId"`
	// The zone ID of the resource.
	ZoneId string `pulumi:"zoneId"`
}

// GetDbInstancesInstanceInput is an input type that accepts GetDbInstancesInstanceArgs and GetDbInstancesInstanceOutput values.
// You can construct a concrete instance of `GetDbInstancesInstanceInput` via:
//
//	GetDbInstancesInstanceArgs{...}
type GetDbInstancesInstanceInput interface {
	pulumi.Input

	ToGetDbInstancesInstanceOutput() GetDbInstancesInstanceOutput
	ToGetDbInstancesInstanceOutputWithContext(context.Context) GetDbInstancesInstanceOutput
}

type GetDbInstancesInstanceArgs struct {
	// Virtual Private Cloud (vpc connection such as a VPN connection or leased line domain name).
	ConnectionString pulumi.StringInput `pulumi:"connectionString"`
	// Creation time, which follows the format of `YYYY-MM-DD 'T'hh:mm:ssZ`, such as `2011-05-30 T12:11:4Z`.
	CreateTime pulumi.StringInput `pulumi:"createTime"`
	// The current kernel image version.
	CurrentMinorVersion pulumi.StringInput `pulumi:"currentMinorVersion"`
	// The category of the db instance.
	DbInstanceCategory pulumi.StringInput `pulumi:"dbInstanceCategory"`
	// For example, instances can be grouped according to Cpu core count.
	DbInstanceCpu pulumi.StringInput `pulumi:"dbInstanceCpu"`
	// According to the practical example or notes.
	DbInstanceDescription pulumi.StringInput `pulumi:"dbInstanceDescription"`
	// The ID of the instance.
	DbInstanceId pulumi.StringInput `pulumi:"dbInstanceId"`
	// IP ADDRESS whitelist for the instance group list.
	DbInstanceIpArrays GetDbInstancesInstanceDbInstanceIpArrayArrayInput `pulumi:"dbInstanceIpArrays"`
	// Instance memory, which is measured in MB.
	DbInstanceMemory pulumi.StringInput `pulumi:"dbInstanceMemory"`
	// The network type of the db instance.
	DbInstanceNetworkType pulumi.StringInput `pulumi:"dbInstanceNetworkType"`
	// Disk storage type. Valid values: `cloudEssd`, `cloudSsd`.
	DbInstanceStorageType pulumi.StringInput `pulumi:"dbInstanceStorageType"`
	// The type of the db instance.
	DbInstanceType pulumi.StringInput `pulumi:"dbInstanceType"`
	// The class of the db node.
	DbNodeClass pulumi.StringInput `pulumi:"dbNodeClass"`
	// The count of the db node.
	DbNodeCount pulumi.StringInput `pulumi:"dbNodeCount"`
	// Instance storage space, which is measured in GB.
	DbNodeStorage pulumi.StringInput `pulumi:"dbNodeStorage"`
	// Kernel Version. Value range: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
	DbVersion pulumi.StringInput `pulumi:"dbVersion"`
	// The instance after it expires time for subscription instance.
	ExpireTime pulumi.StringInput `pulumi:"expireTime"`
	// The expire status of the db instance.
	Expired pulumi.StringInput `pulumi:"expired"`
	// The ID of the Db Instance.
	Id pulumi.StringInput `pulumi:"id"`
	// The latest kernel image version.
	LatestMinorVersion pulumi.StringInput `pulumi:"latestMinorVersion"`
	// Instance lock state. Value range: `Unlock`, `ManualLock`, `LockByExpiration`, `LockByRestoration` and `LockByDiskQuota`. `Unlock`: normal. `ManualLock`: the manual trigger lock. `LockByExpiration`: that represents the instance expires automatically lock. `LockByRestoration`: indicates that the instance rollback before auto-lock. `LockByDiskQuota`: that represents the instance space full automatic lock.
	LockMode pulumi.StringInput `pulumi:"lockMode"`
	// An instance is locked the reason.
	LockReason pulumi.StringInput `pulumi:"lockReason"`
	// Instance maintenance time such as `00:00Z-02:00Z`, 0 to 2 points to carry out routine maintenance.
	MaintainTime pulumi.StringInput `pulumi:"maintainTime"`
	// The master instance ID of the db instance.
	MasterDbInstanceId pulumi.StringInput `pulumi:"masterDbInstanceId"`
	// The paymen type of the resource.
	PaymentType pulumi.StringInput `pulumi:"paymentType"`
	// Application Port.
	Port pulumi.IntInput `pulumi:"port"`
	// The public connection string ID of the resource.
	PublicConnectionString pulumi.StringInput `pulumi:"publicConnectionString"`
	// The public port ID of the resource.
	PublicPort pulumi.IntInput `pulumi:"publicPort"`
	// The array of the readonly db instances.
	ReadOnlyDbInstanceIds pulumi.StringArrayInput `pulumi:"readOnlyDbInstanceIds"`
	// Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
	Status pulumi.StringInput `pulumi:"status"`
	// The vpc id of the db instance.
	VpcId pulumi.StringInput `pulumi:"vpcId"`
	// The vswitch id.
	VswitchId pulumi.StringInput `pulumi:"vswitchId"`
	// The zone ID of the resource.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (GetDbInstancesInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbInstancesInstance)(nil)).Elem()
}

func (i GetDbInstancesInstanceArgs) ToGetDbInstancesInstanceOutput() GetDbInstancesInstanceOutput {
	return i.ToGetDbInstancesInstanceOutputWithContext(context.Background())
}

func (i GetDbInstancesInstanceArgs) ToGetDbInstancesInstanceOutputWithContext(ctx context.Context) GetDbInstancesInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDbInstancesInstanceOutput)
}

func (i GetDbInstancesInstanceArgs) ToOutput(ctx context.Context) pulumix.Output[GetDbInstancesInstance] {
	return pulumix.Output[GetDbInstancesInstance]{
		OutputState: i.ToGetDbInstancesInstanceOutputWithContext(ctx).OutputState,
	}
}

// GetDbInstancesInstanceArrayInput is an input type that accepts GetDbInstancesInstanceArray and GetDbInstancesInstanceArrayOutput values.
// You can construct a concrete instance of `GetDbInstancesInstanceArrayInput` via:
//
//	GetDbInstancesInstanceArray{ GetDbInstancesInstanceArgs{...} }
type GetDbInstancesInstanceArrayInput interface {
	pulumi.Input

	ToGetDbInstancesInstanceArrayOutput() GetDbInstancesInstanceArrayOutput
	ToGetDbInstancesInstanceArrayOutputWithContext(context.Context) GetDbInstancesInstanceArrayOutput
}

type GetDbInstancesInstanceArray []GetDbInstancesInstanceInput

func (GetDbInstancesInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDbInstancesInstance)(nil)).Elem()
}

func (i GetDbInstancesInstanceArray) ToGetDbInstancesInstanceArrayOutput() GetDbInstancesInstanceArrayOutput {
	return i.ToGetDbInstancesInstanceArrayOutputWithContext(context.Background())
}

func (i GetDbInstancesInstanceArray) ToGetDbInstancesInstanceArrayOutputWithContext(ctx context.Context) GetDbInstancesInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDbInstancesInstanceArrayOutput)
}

func (i GetDbInstancesInstanceArray) ToOutput(ctx context.Context) pulumix.Output[[]GetDbInstancesInstance] {
	return pulumix.Output[[]GetDbInstancesInstance]{
		OutputState: i.ToGetDbInstancesInstanceArrayOutputWithContext(ctx).OutputState,
	}
}

type GetDbInstancesInstanceOutput struct{ *pulumi.OutputState }

func (GetDbInstancesInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbInstancesInstance)(nil)).Elem()
}

func (o GetDbInstancesInstanceOutput) ToGetDbInstancesInstanceOutput() GetDbInstancesInstanceOutput {
	return o
}

func (o GetDbInstancesInstanceOutput) ToGetDbInstancesInstanceOutputWithContext(ctx context.Context) GetDbInstancesInstanceOutput {
	return o
}

func (o GetDbInstancesInstanceOutput) ToOutput(ctx context.Context) pulumix.Output[GetDbInstancesInstance] {
	return pulumix.Output[GetDbInstancesInstance]{
		OutputState: o.OutputState,
	}
}

// Virtual Private Cloud (vpc connection such as a VPN connection or leased line domain name).
func (o GetDbInstancesInstanceOutput) ConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.ConnectionString }).(pulumi.StringOutput)
}

// Creation time, which follows the format of `YYYY-MM-DD 'T'hh:mm:ssZ`, such as `2011-05-30 T12:11:4Z`.
func (o GetDbInstancesInstanceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.CreateTime }).(pulumi.StringOutput)
}

// The current kernel image version.
func (o GetDbInstancesInstanceOutput) CurrentMinorVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.CurrentMinorVersion }).(pulumi.StringOutput)
}

// The category of the db instance.
func (o GetDbInstancesInstanceOutput) DbInstanceCategory() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbInstanceCategory }).(pulumi.StringOutput)
}

// For example, instances can be grouped according to Cpu core count.
func (o GetDbInstancesInstanceOutput) DbInstanceCpu() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbInstanceCpu }).(pulumi.StringOutput)
}

// According to the practical example or notes.
func (o GetDbInstancesInstanceOutput) DbInstanceDescription() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbInstanceDescription }).(pulumi.StringOutput)
}

// The ID of the instance.
func (o GetDbInstancesInstanceOutput) DbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbInstanceId }).(pulumi.StringOutput)
}

// IP ADDRESS whitelist for the instance group list.
func (o GetDbInstancesInstanceOutput) DbInstanceIpArrays() GetDbInstancesInstanceDbInstanceIpArrayArrayOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) []GetDbInstancesInstanceDbInstanceIpArray { return v.DbInstanceIpArrays }).(GetDbInstancesInstanceDbInstanceIpArrayArrayOutput)
}

// Instance memory, which is measured in MB.
func (o GetDbInstancesInstanceOutput) DbInstanceMemory() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbInstanceMemory }).(pulumi.StringOutput)
}

// The network type of the db instance.
func (o GetDbInstancesInstanceOutput) DbInstanceNetworkType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbInstanceNetworkType }).(pulumi.StringOutput)
}

// Disk storage type. Valid values: `cloudEssd`, `cloudSsd`.
func (o GetDbInstancesInstanceOutput) DbInstanceStorageType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbInstanceStorageType }).(pulumi.StringOutput)
}

// The type of the db instance.
func (o GetDbInstancesInstanceOutput) DbInstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbInstanceType }).(pulumi.StringOutput)
}

// The class of the db node.
func (o GetDbInstancesInstanceOutput) DbNodeClass() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbNodeClass }).(pulumi.StringOutput)
}

// The count of the db node.
func (o GetDbInstancesInstanceOutput) DbNodeCount() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbNodeCount }).(pulumi.StringOutput)
}

// Instance storage space, which is measured in GB.
func (o GetDbInstancesInstanceOutput) DbNodeStorage() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbNodeStorage }).(pulumi.StringOutput)
}

// Kernel Version. Value range: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
func (o GetDbInstancesInstanceOutput) DbVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.DbVersion }).(pulumi.StringOutput)
}

// The instance after it expires time for subscription instance.
func (o GetDbInstancesInstanceOutput) ExpireTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.ExpireTime }).(pulumi.StringOutput)
}

// The expire status of the db instance.
func (o GetDbInstancesInstanceOutput) Expired() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.Expired }).(pulumi.StringOutput)
}

// The ID of the Db Instance.
func (o GetDbInstancesInstanceOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.Id }).(pulumi.StringOutput)
}

// The latest kernel image version.
func (o GetDbInstancesInstanceOutput) LatestMinorVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.LatestMinorVersion }).(pulumi.StringOutput)
}

// Instance lock state. Value range: `Unlock`, `ManualLock`, `LockByExpiration`, `LockByRestoration` and `LockByDiskQuota`. `Unlock`: normal. `ManualLock`: the manual trigger lock. `LockByExpiration`: that represents the instance expires automatically lock. `LockByRestoration`: indicates that the instance rollback before auto-lock. `LockByDiskQuota`: that represents the instance space full automatic lock.
func (o GetDbInstancesInstanceOutput) LockMode() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.LockMode }).(pulumi.StringOutput)
}

// An instance is locked the reason.
func (o GetDbInstancesInstanceOutput) LockReason() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.LockReason }).(pulumi.StringOutput)
}

// Instance maintenance time such as `00:00Z-02:00Z`, 0 to 2 points to carry out routine maintenance.
func (o GetDbInstancesInstanceOutput) MaintainTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.MaintainTime }).(pulumi.StringOutput)
}

// The master instance ID of the db instance.
func (o GetDbInstancesInstanceOutput) MasterDbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.MasterDbInstanceId }).(pulumi.StringOutput)
}

// The paymen type of the resource.
func (o GetDbInstancesInstanceOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.PaymentType }).(pulumi.StringOutput)
}

// Application Port.
func (o GetDbInstancesInstanceOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) int { return v.Port }).(pulumi.IntOutput)
}

// The public connection string ID of the resource.
func (o GetDbInstancesInstanceOutput) PublicConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.PublicConnectionString }).(pulumi.StringOutput)
}

// The public port ID of the resource.
func (o GetDbInstancesInstanceOutput) PublicPort() pulumi.IntOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) int { return v.PublicPort }).(pulumi.IntOutput)
}

// The array of the readonly db instances.
func (o GetDbInstancesInstanceOutput) ReadOnlyDbInstanceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) []string { return v.ReadOnlyDbInstanceIds }).(pulumi.StringArrayOutput)
}

// Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
func (o GetDbInstancesInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.Status }).(pulumi.StringOutput)
}

// The vpc id of the db instance.
func (o GetDbInstancesInstanceOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.VpcId }).(pulumi.StringOutput)
}

// The vswitch id.
func (o GetDbInstancesInstanceOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.VswitchId }).(pulumi.StringOutput)
}

// The zone ID of the resource.
func (o GetDbInstancesInstanceOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancesInstance) string { return v.ZoneId }).(pulumi.StringOutput)
}

type GetDbInstancesInstanceArrayOutput struct{ *pulumi.OutputState }

func (GetDbInstancesInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDbInstancesInstance)(nil)).Elem()
}

func (o GetDbInstancesInstanceArrayOutput) ToGetDbInstancesInstanceArrayOutput() GetDbInstancesInstanceArrayOutput {
	return o
}

func (o GetDbInstancesInstanceArrayOutput) ToGetDbInstancesInstanceArrayOutputWithContext(ctx context.Context) GetDbInstancesInstanceArrayOutput {
	return o
}

func (o GetDbInstancesInstanceArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]GetDbInstancesInstance] {
	return pulumix.Output[[]GetDbInstancesInstance]{
		OutputState: o.OutputState,
	}
}

func (o GetDbInstancesInstanceArrayOutput) Index(i pulumi.IntInput) GetDbInstancesInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetDbInstancesInstance {
		return vs[0].([]GetDbInstancesInstance)[vs[1].(int)]
	}).(GetDbInstancesInstanceOutput)
}

type GetDbInstancesInstanceDbInstanceIpArray struct {
	// The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
	DbInstanceIpArrayAttribute *string `pulumi:"dbInstanceIpArrayAttribute"`
	// IP ADDRESS whitelist group name.
	DbInstanceIpArrayName *string `pulumi:"dbInstanceIpArrayName"`
	// IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
	SecurityIps *string `pulumi:"securityIps"`
}

// GetDbInstancesInstanceDbInstanceIpArrayInput is an input type that accepts GetDbInstancesInstanceDbInstanceIpArray and GetDbInstancesInstanceDbInstanceIpArrayOutput values.
// You can construct a concrete instance of `GetDbInstancesInstanceDbInstanceIpArrayInput` via:
//
//	GetDbInstancesInstanceDbInstanceIpArray{ GetDbInstancesInstanceDbInstanceIpArgs{...} }
type GetDbInstancesInstanceDbInstanceIpArrayInput interface {
	pulumi.Input

	ToGetDbInstancesInstanceDbInstanceIpArrayOutput() GetDbInstancesInstanceDbInstanceIpArrayOutput
	ToGetDbInstancesInstanceDbInstanceIpArrayOutputWithContext(context.Context) GetDbInstancesInstanceDbInstanceIpArrayOutput
}

type GetDbInstancesInstanceDbInstanceIpArrayArgs struct {
	// The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
	DbInstanceIpArrayAttribute pulumi.StringPtrInput `pulumi:"dbInstanceIpArrayAttribute"`
	// IP ADDRESS whitelist group name.
	DbInstanceIpArrayName pulumi.StringPtrInput `pulumi:"dbInstanceIpArrayName"`
	// IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
	SecurityIps pulumi.StringPtrInput `pulumi:"securityIps"`
}

func (GetDbInstancesInstanceDbInstanceIpArrayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbInstancesInstanceDbInstanceIpArray)(nil)).Elem()
}

func (i GetDbInstancesInstanceDbInstanceIpArrayArgs) ToGetDbInstancesInstanceDbInstanceIpArrayOutput() GetDbInstancesInstanceDbInstanceIpArrayOutput {
	return i.ToGetDbInstancesInstanceDbInstanceIpArrayOutputWithContext(context.Background())
}

func (i GetDbInstancesInstanceDbInstanceIpArrayArgs) ToGetDbInstancesInstanceDbInstanceIpArrayOutputWithContext(ctx context.Context) GetDbInstancesInstanceDbInstanceIpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDbInstancesInstanceDbInstanceIpArrayOutput)
}

func (i GetDbInstancesInstanceDbInstanceIpArrayArgs) ToOutput(ctx context.Context) pulumix.Output[GetDbInstancesInstanceDbInstanceIpArray] {
	return pulumix.Output[GetDbInstancesInstanceDbInstanceIpArray]{
		OutputState: i.ToGetDbInstancesInstanceDbInstanceIpArrayOutputWithContext(ctx).OutputState,
	}
}

// GetDbInstancesInstanceDbInstanceIpArrayArrayInput is an input type that accepts GetDbInstancesInstanceDbInstanceIpArrayArray and GetDbInstancesInstanceDbInstanceIpArrayArrayOutput values.
// You can construct a concrete instance of `GetDbInstancesInstanceDbInstanceIpArrayArrayInput` via:
//
//	GetDbInstancesInstanceDbInstanceIpArrayArray{ GetDbInstancesInstanceDbInstanceIpArrayArgs{...} }
type GetDbInstancesInstanceDbInstanceIpArrayArrayInput interface {
	pulumi.Input

	ToGetDbInstancesInstanceDbInstanceIpArrayArrayOutput() GetDbInstancesInstanceDbInstanceIpArrayArrayOutput
	ToGetDbInstancesInstanceDbInstanceIpArrayArrayOutputWithContext(context.Context) GetDbInstancesInstanceDbInstanceIpArrayArrayOutput
}

type GetDbInstancesInstanceDbInstanceIpArrayArray []GetDbInstancesInstanceDbInstanceIpArrayInput

func (GetDbInstancesInstanceDbInstanceIpArrayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDbInstancesInstanceDbInstanceIpArray)(nil)).Elem()
}

func (i GetDbInstancesInstanceDbInstanceIpArrayArray) ToGetDbInstancesInstanceDbInstanceIpArrayArrayOutput() GetDbInstancesInstanceDbInstanceIpArrayArrayOutput {
	return i.ToGetDbInstancesInstanceDbInstanceIpArrayArrayOutputWithContext(context.Background())
}

func (i GetDbInstancesInstanceDbInstanceIpArrayArray) ToGetDbInstancesInstanceDbInstanceIpArrayArrayOutputWithContext(ctx context.Context) GetDbInstancesInstanceDbInstanceIpArrayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDbInstancesInstanceDbInstanceIpArrayArrayOutput)
}

func (i GetDbInstancesInstanceDbInstanceIpArrayArray) ToOutput(ctx context.Context) pulumix.Output[[]GetDbInstancesInstanceDbInstanceIpArray] {
	return pulumix.Output[[]GetDbInstancesInstanceDbInstanceIpArray]{
		OutputState: i.ToGetDbInstancesInstanceDbInstanceIpArrayArrayOutputWithContext(ctx).OutputState,
	}
}

type GetDbInstancesInstanceDbInstanceIpArrayOutput struct{ *pulumi.OutputState }

func (GetDbInstancesInstanceDbInstanceIpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbInstancesInstanceDbInstanceIpArray)(nil)).Elem()
}

func (o GetDbInstancesInstanceDbInstanceIpArrayOutput) ToGetDbInstancesInstanceDbInstanceIpArrayOutput() GetDbInstancesInstanceDbInstanceIpArrayOutput {
	return o
}

func (o GetDbInstancesInstanceDbInstanceIpArrayOutput) ToGetDbInstancesInstanceDbInstanceIpArrayOutputWithContext(ctx context.Context) GetDbInstancesInstanceDbInstanceIpArrayOutput {
	return o
}

func (o GetDbInstancesInstanceDbInstanceIpArrayOutput) ToOutput(ctx context.Context) pulumix.Output[GetDbInstancesInstanceDbInstanceIpArray] {
	return pulumix.Output[GetDbInstancesInstanceDbInstanceIpArray]{
		OutputState: o.OutputState,
	}
}

// The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
func (o GetDbInstancesInstanceDbInstanceIpArrayOutput) DbInstanceIpArrayAttribute() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbInstancesInstanceDbInstanceIpArray) *string { return v.DbInstanceIpArrayAttribute }).(pulumi.StringPtrOutput)
}

// IP ADDRESS whitelist group name.
func (o GetDbInstancesInstanceDbInstanceIpArrayOutput) DbInstanceIpArrayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbInstancesInstanceDbInstanceIpArray) *string { return v.DbInstanceIpArrayName }).(pulumi.StringPtrOutput)
}

// IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
func (o GetDbInstancesInstanceDbInstanceIpArrayOutput) SecurityIps() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbInstancesInstanceDbInstanceIpArray) *string { return v.SecurityIps }).(pulumi.StringPtrOutput)
}

type GetDbInstancesInstanceDbInstanceIpArrayArrayOutput struct{ *pulumi.OutputState }

func (GetDbInstancesInstanceDbInstanceIpArrayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDbInstancesInstanceDbInstanceIpArray)(nil)).Elem()
}

func (o GetDbInstancesInstanceDbInstanceIpArrayArrayOutput) ToGetDbInstancesInstanceDbInstanceIpArrayArrayOutput() GetDbInstancesInstanceDbInstanceIpArrayArrayOutput {
	return o
}

func (o GetDbInstancesInstanceDbInstanceIpArrayArrayOutput) ToGetDbInstancesInstanceDbInstanceIpArrayArrayOutputWithContext(ctx context.Context) GetDbInstancesInstanceDbInstanceIpArrayArrayOutput {
	return o
}

func (o GetDbInstancesInstanceDbInstanceIpArrayArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]GetDbInstancesInstanceDbInstanceIpArray] {
	return pulumix.Output[[]GetDbInstancesInstanceDbInstanceIpArray]{
		OutputState: o.OutputState,
	}
}

func (o GetDbInstancesInstanceDbInstanceIpArrayArrayOutput) Index(i pulumi.IntInput) GetDbInstancesInstanceDbInstanceIpArrayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetDbInstancesInstanceDbInstanceIpArray {
		return vs[0].([]GetDbInstancesInstanceDbInstanceIpArray)[vs[1].(int)]
	}).(GetDbInstancesInstanceDbInstanceIpArrayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceDbInstanceIpArrayInput)(nil)).Elem(), DbInstanceDbInstanceIpArrayArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*DbInstanceDbInstanceIpArrayArrayInput)(nil)).Elem(), DbInstanceDbInstanceIpArrayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDbInstancesInstanceInput)(nil)).Elem(), GetDbInstancesInstanceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDbInstancesInstanceArrayInput)(nil)).Elem(), GetDbInstancesInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDbInstancesInstanceDbInstanceIpArrayInput)(nil)).Elem(), GetDbInstancesInstanceDbInstanceIpArrayArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDbInstancesInstanceDbInstanceIpArrayArrayInput)(nil)).Elem(), GetDbInstancesInstanceDbInstanceIpArrayArray{})
	pulumi.RegisterOutputType(DbInstanceDbInstanceIpArrayOutput{})
	pulumi.RegisterOutputType(DbInstanceDbInstanceIpArrayArrayOutput{})
	pulumi.RegisterOutputType(GetDbInstancesInstanceOutput{})
	pulumi.RegisterOutputType(GetDbInstancesInstanceArrayOutput{})
	pulumi.RegisterOutputType(GetDbInstancesInstanceDbInstanceIpArrayOutput{})
	pulumi.RegisterOutputType(GetDbInstancesInstanceDbInstanceIpArrayArrayOutput{})
}
