// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Ecd Desktops of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.144.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eds"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		defaultSimpleOfficeSite, err := eds.NewSimpleOfficeSite(ctx, "defaultSimpleOfficeSite", &eds.SimpleOfficeSiteArgs{
// 			CidrBlock:         pulumi.String("172.16.0.0/12"),
// 			DesktopAccessType: pulumi.String("Internet"),
// 			OfficeSiteName:    pulumi.String("your_office_site_name"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		opt0 := "SYSTEM"
// 		defaultBundles, err := eds.GetBundles(ctx, &eds.GetBundlesArgs{
// 			BundleType: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultEcdPolicyGroup, err := eds.NewEcdPolicyGroup(ctx, "defaultEcdPolicyGroup", &eds.EcdPolicyGroupArgs{
// 			PolicyGroupName: pulumi.String("your_policy_group_name"),
// 			Clipboard:       pulumi.String("readwrite"),
// 			LocalDrive:      pulumi.String("read"),
// 			AuthorizeAccessPolicyRules: eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArray{
// 				&eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArgs{
// 					Description: pulumi.String("example_value"),
// 					CidrIp:      pulumi.String("1.2.3.4/24"),
// 				},
// 			},
// 			AuthorizeSecurityPolicyRules: eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArray{
// 				&eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs{
// 					Type:        pulumi.String("inflow"),
// 					Policy:      pulumi.String("accept"),
// 					Description: pulumi.String("example_value"),
// 					PortRange:   pulumi.String("80/80"),
// 					IpProtocol:  pulumi.String("TCP"),
// 					Priority:    pulumi.String("1"),
// 					CidrIp:      pulumi.String("0.0.0.0/0"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultUser, err := eds.NewUser(ctx, "defaultUser", &eds.UserArgs{
// 			EndUserId: pulumi.String("your_end_user_id"),
// 			Email:     pulumi.String("your_email"),
// 			Phone:     pulumi.String("your_phone"),
// 			Password:  pulumi.String("your_password"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultDesktop, err := eds.NewDesktop(ctx, "defaultDesktop", &eds.DesktopArgs{
// 			OfficeSiteId:  defaultSimpleOfficeSite.ID(),
// 			PolicyGroupId: defaultEcdPolicyGroup.ID(),
// 			BundleId:      pulumi.String(defaultBundles.Bundles[0].Id),
// 			DesktopName:   pulumi.String("your_desktop_name"),
// 			EndUserIds: pulumi.StringArray{
// 				defaultUser.ID(),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("ecdDesktopId1", ids.ApplyT(func(ids eds.GetDesktopsResult) (string, error) {
// 			return ids.Desktops[0].Id, nil
// 		}).(pulumi.StringOutput))
// 		ctx.Export("ecdDesktopId2", nameRegex.ApplyT(func(nameRegex eds.GetDesktopsResult) (string, error) {
// 			return nameRegex.Desktops[0].Id, nil
// 		}).(pulumi.StringOutput))
// 		return nil
// 	})
// }
// ```
func GetDesktops(ctx *pulumi.Context, args *GetDesktopsArgs, opts ...pulumi.InvokeOption) (*GetDesktopsResult, error) {
	var rv GetDesktopsResult
	err := ctx.Invoke("alicloud:eds/getDesktops:getDesktops", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDesktops.
type GetDesktopsArgs struct {
	// The desktop name of the Desktop.
	DesktopName *string `pulumi:"desktopName"`
	// The desktop end user id of the Desktop.
	EndUserIds []string `pulumi:"endUserIds"`
	// A list of Desktop IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Desktop name.
	NameRegex *string `pulumi:"nameRegex"`
	// The ID of the Simple Office Site.
	OfficeSiteId *string `pulumi:"officeSiteId"`
	OutputFile   *string `pulumi:"outputFile"`
	// The policy group id of the Desktop.
	PolicyGroupId *string `pulumi:"policyGroupId"`
	// The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getDesktops.
type GetDesktopsResult struct {
	DesktopName *string              `pulumi:"desktopName"`
	Desktops    []GetDesktopsDesktop `pulumi:"desktops"`
	EndUserIds  []string             `pulumi:"endUserIds"`
	// The provider-assigned unique ID for this managed resource.
	Id            string   `pulumi:"id"`
	Ids           []string `pulumi:"ids"`
	NameRegex     *string  `pulumi:"nameRegex"`
	Names         []string `pulumi:"names"`
	OfficeSiteId  *string  `pulumi:"officeSiteId"`
	OutputFile    *string  `pulumi:"outputFile"`
	PolicyGroupId *string  `pulumi:"policyGroupId"`
	Status        *string  `pulumi:"status"`
}

func GetDesktopsOutput(ctx *pulumi.Context, args GetDesktopsOutputArgs, opts ...pulumi.InvokeOption) GetDesktopsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDesktopsResult, error) {
			args := v.(GetDesktopsArgs)
			r, err := GetDesktops(ctx, &args, opts...)
			return *r, err
		}).(GetDesktopsResultOutput)
}

// A collection of arguments for invoking getDesktops.
type GetDesktopsOutputArgs struct {
	// The desktop name of the Desktop.
	DesktopName pulumi.StringPtrInput `pulumi:"desktopName"`
	// The desktop end user id of the Desktop.
	EndUserIds pulumi.StringArrayInput `pulumi:"endUserIds"`
	// A list of Desktop IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Desktop name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// The ID of the Simple Office Site.
	OfficeSiteId pulumi.StringPtrInput `pulumi:"officeSiteId"`
	OutputFile   pulumi.StringPtrInput `pulumi:"outputFile"`
	// The policy group id of the Desktop.
	PolicyGroupId pulumi.StringPtrInput `pulumi:"policyGroupId"`
	// The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetDesktopsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDesktopsArgs)(nil)).Elem()
}

// A collection of values returned by getDesktops.
type GetDesktopsResultOutput struct{ *pulumi.OutputState }

func (GetDesktopsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDesktopsResult)(nil)).Elem()
}

func (o GetDesktopsResultOutput) ToGetDesktopsResultOutput() GetDesktopsResultOutput {
	return o
}

func (o GetDesktopsResultOutput) ToGetDesktopsResultOutputWithContext(ctx context.Context) GetDesktopsResultOutput {
	return o
}

func (o GetDesktopsResultOutput) DesktopName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDesktopsResult) *string { return v.DesktopName }).(pulumi.StringPtrOutput)
}

func (o GetDesktopsResultOutput) Desktops() GetDesktopsDesktopArrayOutput {
	return o.ApplyT(func(v GetDesktopsResult) []GetDesktopsDesktop { return v.Desktops }).(GetDesktopsDesktopArrayOutput)
}

func (o GetDesktopsResultOutput) EndUserIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDesktopsResult) []string { return v.EndUserIds }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDesktopsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDesktopsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDesktopsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDesktopsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDesktopsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDesktopsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetDesktopsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDesktopsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetDesktopsResultOutput) OfficeSiteId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDesktopsResult) *string { return v.OfficeSiteId }).(pulumi.StringPtrOutput)
}

func (o GetDesktopsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDesktopsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDesktopsResultOutput) PolicyGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDesktopsResult) *string { return v.PolicyGroupId }).(pulumi.StringPtrOutput)
}

func (o GetDesktopsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDesktopsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDesktopsResultOutput{})
}
