// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cddc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cddc Host Ecs Level Infos of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.147.0+.
func GetHostEcsLevelInfos(ctx *pulumi.Context, args *GetHostEcsLevelInfosArgs, opts ...pulumi.InvokeOption) (*GetHostEcsLevelInfosResult, error) {
	var rv GetHostEcsLevelInfosResult
	err := ctx.Invoke("alicloud:cddc/getHostEcsLevelInfos:getHostEcsLevelInfos", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHostEcsLevelInfos.
type GetHostEcsLevelInfosArgs struct {
	// The database engine of the host. Valid values: `mysql`, `mssql`, `pgsql`, `redis`.
	DbType string `pulumi:"dbType"`
	// Host image. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
	ImageCategory *string `pulumi:"imageCategory"`
	OutputFile    *string `pulumi:"outputFile"`
	// The storage type of the host ecs level info. Valid values: `localSsd`, `cloudEssd`, `cloudEssd2`, `cloudEssd3`.
	// * `localSsd`: specifies that the host uses local SSDs.
	// * `cloudEssd`: specifies that the host uses enhanced SSDs (ESSDs) of performance level (PL) 1.
	// * `cloudEssd2`: specifies that the host uses ESSDs of PL2.
	// * `cloudEssd3`: specifies that the host uses ESSDs of PL3.
	StorageType string `pulumi:"storageType"`
	// The ID of the zone in the region.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getHostEcsLevelInfos.
type GetHostEcsLevelInfosResult struct {
	DbType string `pulumi:"dbType"`
	// The provider-assigned unique ID for this managed resource.
	Id            string                     `pulumi:"id"`
	ImageCategory *string                    `pulumi:"imageCategory"`
	Infos         []GetHostEcsLevelInfosInfo `pulumi:"infos"`
	OutputFile    *string                    `pulumi:"outputFile"`
	StorageType   string                     `pulumi:"storageType"`
	ZoneId        string                     `pulumi:"zoneId"`
}

func GetHostEcsLevelInfosOutput(ctx *pulumi.Context, args GetHostEcsLevelInfosOutputArgs, opts ...pulumi.InvokeOption) GetHostEcsLevelInfosResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetHostEcsLevelInfosResult, error) {
			args := v.(GetHostEcsLevelInfosArgs)
			r, err := GetHostEcsLevelInfos(ctx, &args, opts...)
			return *r, err
		}).(GetHostEcsLevelInfosResultOutput)
}

// A collection of arguments for invoking getHostEcsLevelInfos.
type GetHostEcsLevelInfosOutputArgs struct {
	// The database engine of the host. Valid values: `mysql`, `mssql`, `pgsql`, `redis`.
	DbType pulumi.StringInput `pulumi:"dbType"`
	// Host image. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
	ImageCategory pulumi.StringPtrInput `pulumi:"imageCategory"`
	OutputFile    pulumi.StringPtrInput `pulumi:"outputFile"`
	// The storage type of the host ecs level info. Valid values: `localSsd`, `cloudEssd`, `cloudEssd2`, `cloudEssd3`.
	// * `localSsd`: specifies that the host uses local SSDs.
	// * `cloudEssd`: specifies that the host uses enhanced SSDs (ESSDs) of performance level (PL) 1.
	// * `cloudEssd2`: specifies that the host uses ESSDs of PL2.
	// * `cloudEssd3`: specifies that the host uses ESSDs of PL3.
	StorageType pulumi.StringInput `pulumi:"storageType"`
	// The ID of the zone in the region.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (GetHostEcsLevelInfosOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostEcsLevelInfosArgs)(nil)).Elem()
}

// A collection of values returned by getHostEcsLevelInfos.
type GetHostEcsLevelInfosResultOutput struct{ *pulumi.OutputState }

func (GetHostEcsLevelInfosResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostEcsLevelInfosResult)(nil)).Elem()
}

func (o GetHostEcsLevelInfosResultOutput) ToGetHostEcsLevelInfosResultOutput() GetHostEcsLevelInfosResultOutput {
	return o
}

func (o GetHostEcsLevelInfosResultOutput) ToGetHostEcsLevelInfosResultOutputWithContext(ctx context.Context) GetHostEcsLevelInfosResultOutput {
	return o
}

func (o GetHostEcsLevelInfosResultOutput) DbType() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostEcsLevelInfosResult) string { return v.DbType }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHostEcsLevelInfosResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostEcsLevelInfosResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetHostEcsLevelInfosResultOutput) ImageCategory() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostEcsLevelInfosResult) *string { return v.ImageCategory }).(pulumi.StringPtrOutput)
}

func (o GetHostEcsLevelInfosResultOutput) Infos() GetHostEcsLevelInfosInfoArrayOutput {
	return o.ApplyT(func(v GetHostEcsLevelInfosResult) []GetHostEcsLevelInfosInfo { return v.Infos }).(GetHostEcsLevelInfosInfoArrayOutput)
}

func (o GetHostEcsLevelInfosResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostEcsLevelInfosResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetHostEcsLevelInfosResultOutput) StorageType() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostEcsLevelInfosResult) string { return v.StorageType }).(pulumi.StringOutput)
}

func (o GetHostEcsLevelInfosResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostEcsLevelInfosResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHostEcsLevelInfosResultOutput{})
}
