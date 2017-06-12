package com.elfatah.testgramedia.storage.repository;

import com.elfatah.testgramedia.domain.model.Content;
import com.elfatah.testgramedia.domain.repository.ContentRepo;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

/**
 * Created by elfatahwashere on 6/12/2017.
 */

public class ContentRepoImpl implements ContentRepo {
    @Override
    public Observable<List<Content>> getAllContent() {
        List<Content> strings = new ArrayList<>();
        strings.add(new Content("THE AGREEMENTS SET OUT BELOW ARE BETWEEN YOU AND APPS FOUNDRY AND REGULATING YOUR USE OF SCOOP STORES (\"STORES\") AND SCOOP SERVICES (\"SERVICES\").BY USING SCOOP, YOU ARE AGREEING THESE TERMS. IF YOU DO NOT AGREE TO THESE TERMS, DO NOT USE SCOOP.\n" +
                "\n" +
                "A. TERMS OF SALE\n" +
                "PAYMENTS, TAXES, AND REFUND POLICY\n" +
                "Apps Foundry services accept whichever payment method you choose. Apps Foundry may obtain preapproval for an amount up to the amount of the order.Billing occurs right at the time of, or shortly after your transaction. If you are using 1-Click purchasing, your order may be authorized andbilled gradually during one purchasing session; so it may appear as multiple orders on your statement.\n" +
                "\n" +
                "You agree that you will pay for all products (including contents, subscriptions, and services) you purchase through the Stores,and that Apps Foundry may charge your payment method for any products (including contents, subscriptions, and services) purchased and forany additional amounts (including any taxes and late fees, as applicable) that may be accumulated within your Account.YOU ARE RESPONSIBLE FOR THE TIMELY PAYMENT OF ALL FEES AND FOR PROVIDING SCOOP WITH A VALID PAYMENT METHOD FOR PAYMENT OF ALL FEES.All fees will be billed to the payment method you choose. On iTunes account or Google Play account ,if you want to use a different credit card or if there is a change in your credit card account status, you must change your informationon that payment account; this may temporarily disrupts your access while the payment account verifies your new payment information."));
        strings.add(new Content("You agree that payments you commit to Apps Foundry for products (including contents, subscriptions, and services) are exclusive of taxes including any value added taxes,goods and services taxes, sales taxes, use taxes, stamp taxes, and any other related taxes and if such taxes are applicable on your purchases,you agree to bear responsibility for the administration and payment of such taxes.Additional fees, such as cross border transaction fees and credit card fees may apply.\n" +
                "\n" +
                "All sales and rentals of products are final.\n" +
                "\n" +
                "Apps Foundry reserves the right to change prices for products offered via the Stores at any time, andthe Stores do not provide price protection or refunds in the event of a price reduction or promotional offering subsequent to purchase.\n" +
                "\n" +
                "If a product becomes unavailable following a transaction but prior to download, your sole remedy is a refund. If technical problems preventor unreasonably delay delivery of your product, your exclusive and sole remedy is either replacement or refund of the price paid, as determined by Apps Foundry."));
        strings.add(new Content("DISCOUNT CODE CERTIFICATES\n" +
                "Apps Foundry may generate and distribute discount codes as coupons or other print medias, email or other digital medias (\"Discount Code Ceritificates\").Discount Code Ceritificates can be used to get discounted price or certain contents.\n" +
                "\n" +
                "Use of Discount Code Certificates are subject to the following terms:\n" +
                "\n" +
                "Each Discount Code Certificates have different terms and rewards. To use Discount Code Certificates, ensure all terms already met.\n" +
                "Each Discount Code Certificates are intended for single use only.\n" +
                "The Discount Code Certificates Point Allowances may not be used in conjunction with the purchase of productssold by or under the brands of third parties, including, but not limited to,Apps Foundry affiliates or third-party merchants, including online stores linked to any existing Stores.\n" +
                "The Discount Code Certificates cannot be used in conjunction with any other offers or discounts.\n" +
                "Unused Discount Code Certificates, are not redeemable for cash and cannot be returned for a cash refund; exchanged; resold;used to purchase Discount Code Certificates; used for purchases on the Store.\n" +
                "The Discount Code Certificates can only be used on certain Stores."));
        strings.add(new Content("Apps Foundry is not responsible for lost or stolen Discount Code Certificates.\n" +
                "\n" +
                "Apps Foundry is not responsible for risk of loss and title for Discount Code Certificates that are transmitted electronically upon electronic transmission.\n" +
                "\n" +
                "Apps Foundry reserves the right to close accounts and request alternative forms of payment, if a Discount Code Certificate is fraudulently obtained or used on the Stores.\n" +
                "\n" +
                "SCOOP POINT ALLOWANCES\n" +
                "Apps Foundry may gives loyalty points to users (\"SCOOP Point Allowances\"). SCOOP Point Allowances can be used to redeem contents.\n" +
                "\n" +
                "Use of SCOOP Point Allowances is subject to the following terms:\n" +
                "\n" +
                "The SCOOP Point Allowances may not be used in conjunction with the purchase of products sold by or under the brands of third parties, including,but not limited to, Apps Foundry affiliates or third-party merchants, including online stores linked to any existing Stores.\n" +
                "The SCOOP Point Allowances cannot be used in conjunction with any other payment methods.\n" +
                "Unused SCOOP Point Allowances, are not redeemable for cash and cannot be returned for a cash refund; exchanged; resold; used to purchase Discount Code Certificates; used for purchases on the Store.\n" +
                "Unused SCOOP Point Allowances have validity period, Apps Foundry will automatically deducts a number of SCOOP Point Allowances that passed validity period.\n" +
                "The SCOOP Point Allowances can only be used on certain Stores."));
        strings.add(new Content("Apps Foundry is not responsible for lost or stolen SCOOP Point Allowances.\n" +
                "\n" +
                "Apps Foundry is not responsible for risk of loss and title for SCOOP Point Allowances that are transmitted electronically pass to the user upon electronic transmission.\n" +
                "\n" +
                "Apps Foundry reserves the right to change SCOOP Point Allowances validity period terms at any time without notice.Apps Foundry may also impose limits on the use of or access to SCOOP Point Allowances, in any case and without notice or liability.\n" +
                "\n" +
                "Apps Foundry reserves the right to close accounts and request alternative forms of payment, if SCOOP Point Allowances is fraudulently obtained or used on the Stores.\n" +
                "\n" +
                "GIFTS\n" +
                "Gift recipients must have compatible hardware and software to utilise the gifts.\n" +
                "\n" +
                "PRE-ORDERS\n" +
                "By pre-ordering products, you are authorizing the Stores to automatically charge your account and download the product when the product is available.You may cancel your pre-order prior to the time when the product is available.\n" +
                "\n" +
                "ELECTRONIC CONTRACTING\n" +
                "Your usage of the Stores includes the ability to enter into agreements and/or to make transactions electronically.YOU ACKNOWLEDGE THAT YOUR ELECTRONIC SUBMISSIONS CONSTITUTE YOUR AGREEMENT AND INTENT TO BE BOUND BY AND TO PAY FOR SUCH AGREEMENTS AND TRANSACTIONS.YOUR AGREEMENT AND INTENT TO BE BOUND BY ELECTRONIC SUBMISSIONS APPLIES TO ALL RECORDS RELATING TO ALL TRANSACTIONS YOU ENTER INTO ON THIS SITE,INCLUDING NOTICES OF CANCELLATION, POLICIES, CONTRACTS, AND APPLICATIONS.In order to access and retain your electronic records, you may be required to have certain hardware and software, which solely are your responsibility.\n" +
                "\n" +
                "Apps Foundry is not responsible for any typographic errors."));
        strings.add(new Content("B. SCOOP TERMS AND CONDITIONS\n" +
                "SCOOP SERVICE\n" +
                "SCOOP is the provider of the service (\"Service\"), which permits you to purchase or access or subscribe or rent digital content (\"Content\"),like digital magazines, digital books, digital newspapers, and other digital publications for end-user use only under the terms and conditions set within this Agreement.\n" +
                "\n" +
                "REQUIREMENTS FOR USE OF THE SERVICE\n" +
                "Only persons aged 17 years or older can create accounts. Accounts for persons under 17 years old can be created by parents or legal guardian(s).Children under the age of 17 should review this Agreement with their parents or legal guardian(s) to ensure that the child and parents or legal guardian(s) fully understand it.\n" +
                "\n" +
                "The use of the Service requires compatible devices, Internet access, and certain software (additional fees may apply); may require periodic updates;and may be affected by the performance of aforementioned factors. High-speed Internet access is strongly recommended for regular use.The latest version of SCOOP software is recommended to access the Services and may be required for certain transaction methods or features andto download Content previously purchased from the Service. You agree that to fulfil these requirements, which may change from time to time, is your responsibility.The Service is not part of any other product or offering, and no purchase or obtaining of any other product shall be construed to represent or guarantee you access to the Service."));
        strings.add(new Content("YOUR ACCOUNT\n" +
                "As a registered user of the Service, you may establish an account (\"Account\"). Do not reveal your Account information to anyone else.You are solely responsible for maintaining the confidentiality and security of your Account and for all activities that occur on or through your Account,and you agree to immediately notify SCOOP of any security breach of your Account.SCOOP shall not be responsible for any losses arising out of the unauthorized use of your Account.\n" +
                "\n" +
                "In order to purchase and download Content from the Service, you must login with your SCOOP ID and password to authenticate your Account for transactions.Once you have authenticated your Account using your SCOOP ID and password, you will not need to authenticate again for a while.\n" +
                "\n" +
                "You can login as guest (\"Guest\") on certain OS as a substitution for Account login.Guest only has access on origin Device when login for the first time, cannot associate with other Devices, cannot use SCOOP Point Allowances,cannot login on web, cannot access Account Information, and only has a very limited access to the Service.\n" +
                "\n" +
                "You agree to provide accurate and complete information when you register with, and as you use, the Service (\"Registration Data\"),and you agree to update your Registration Data to keep it accurate and complete.You agree that SCOOP may store and use the Registration Data you provide for use in maintaining and billing fees to your Account."));
        strings.add(new Content("DELIVERY AND DOWNLOADING PREVIOUS PURCHASES\n" +
                "When you first purchased (i.e. not rented) magazine, book, newspaper Content (collectively, \"SCOOP Eligible Content\"),you may elect to receive copies of such SCOOP Eligible Contents subject to the association rules below (each, an \"Associated Device\").On an Associated Device that is capable of receiving push notifications (\"Push-Enabled\"), including iOS and Android Devices,the SCOOP Eligible Contents are downloadable to that Associated Device when it has an Internet connection; on an Associated Device that is not Push-Enabled,SCOOP Eligible Contents will automatically appear in the Cloud Library and you may manually initiate the download within SCOOP.\n" +
                "\n" +
                "As an accommodation to you, subsequent to acquiring SCOOP Eligible Contents, you may download certain of such previously-acquired SCOOP Eligible Contents onto any Associated Device.Some SCOOP Eligible Contents that you previously-acquired may not be available for subsequent download at any given time, and SCOOP shall have no liability to you in such event.As you may not be able to subsequently download certain previously-acquired SCOOP Eligible Contents, once you download an item of SCOOP Eligible Contents,it is your responsibility not to lose, destroy, or damage it, and you may want to back it up.\n" +
                "\n" +
                "Association of Associated Devices is subject to the following terms:\n" +
                "\n" +
                "You may download SCOOP Eligible Content or download previously-purchased SCOOP Eligible Content from an Account on up to 5 SCOOP-authorized Associated Devices.\n" +
                "An Associated Device can be associated with only one Account at any given time.\n" +
                "You may download previously-acquired free content to your devices while it is free on the Service, but on no more than 5 SCOOP-authorized devices.\n" +
                "Some pieces of SCOOP Eligible Content may be large in size, and significant data charges may result from delivering such SCOOP Eligible Content over data connection."));
        strings.add(new Content("SUBSCRIPTIONS AND AUTOMATIC RENEWAL\n" +
                "SCOOP may include functionality that enables you to acquire content on a subscription basis (\"Subscriptions\"). Subscriptions are non-refundable.Certain Subscriptions may be specified as magazine and newspaper products. You should review the additional informations about the magazine and newspaper subscription offer at the time of transaction.We may ask for your permission to provide your name, email address, and zip code listed in your Account to the Publisher of such magazine andnewspaper subscriptions so that said publisher can send you newsletter about its own products in accordance with its publicly posted privacy policy.Once the Publisher has this information, the information will be treated in accordance with the Publisher's privacy policy.We encourage you to learn about the privacy practices of the Publisher before agreeing to give them your personal information.For more information, please review the Publisher's privacy policy or contact the Publisher directly.\n" +
                "\n" +
                "Certain payment methods, such as iTunes, your subscriptions will be automatically renewed for the applicable time period you have chosen, and if the subscription is available,your iTunes account will be charged no more than 24-hours prior to the expiration of your current Subscription.You may cancel automatic renewal of paid subscriptions by managing App Subscriptions in your iTunes account and selecting the subscription you want to cancel.In the event of a price increases, the Subscription may continue at the new price upon prior notice to you unless you have cancelled automatic renewal.Certain paid Subscriptions may offer a free trial period before charging your iTunes account. If you decide you do not want to purchase the In-App Subscription,turn off auto-renewal in your iTunes account settings during the free trial period."));
        strings.add(new Content("WEB READER\n" +
                "Web Reader permits you to remotely access the Content through website.\n" +
                "\n" +
                "Web Reader is not an \"Associated Device\". However, Content can be accessed on Web Reader and you may only access any such Content on a very limited number of Web Readers at the same time.\n" +
                "\n" +
                "When you use Web Reader, SCOOP will log information such as the contents you download, the pages you read, the devices you use, the time, and duration of reading.By using Web Reader, you are agreeing and willing to consent to SCOOP and its subsidiaries' and agents' transmission, collection, maintenance, processing, and use of this information,including your Web Reader usage information to report to licensors and pay royalties, to provide and improve SCOOP features and services andother Apps Foundry products and services, and as otherwise permitted in accordance with Apps Foundry's Privacy Policy,which is available here: http://www.getscoop.com/privacy.\n" +
                "\n" +
                "When you use Web Reader, SCOOP will mark the content with watermark contains Your Personal Information (\"Contents with Watermark\").You are responsible to make sure that the Contents with Watermark are only used personally since it is for noncommercial use.Any illegitimate use of Content with Watermark infringes the rights of others and may subject you to civil and criminal penalties,including possible monetary damages, for copyright infringement.\n" +
                "\n" +
                "Web Reader is provided on an \"AS IS\" basis and may contain errors or inaccuracies that could cause failures, corruption or loss of data and/or information,including music, playlist, and play history, from your computer or device and from peripherals (including, without limitation, servers and other computers) connected thereto.You should back up all data and information on your computer or device and any peripherals prior to using Web Reader.You expressly acknowledge and agree that all uses of Web Reader are at your sole risk.To the extent permitted by law, SCOOP shall have no liability with respect to your use of Web Reader, including the inability to access matched or uploaded content."));
        strings.add(new Content("SCOOP PREMIUM\n" +
                "SCOOP Premium permits you to download and access certain Contents as long as you are in SCOOP Premium subscription period.\n" +
                "\n" +
                "SCOOP Premium is subject to the same terms as Subscriptions. Association of Associated Devices for SCOOP Premium is subject to the same terms as Automatic Delivery andDownloading Previous Purchases, and downloaded contents and related information are deemed to be \"SCOOP Eligible Content\".You may also access SCOOP Premium content from Web Reader, provided that you may only do so on a limited number of Web Reader at the same time.\n" +
                "\n" +
                "When you use SCOOP Premium, SCOOP will log information such as the contents you download, the pages you read, the devices you use, and the time and duration of reading.By using SCOOP Premium, you are agreeing and consenting to SCOOP and its subsidiaries' and agents' transmission, collection, maintenance, processing, and use of this information,including your SCOOP Premium usage information, to report to licensors and pay royalties, provide and improve SCOOP features and services and other Apps Foundry products and services,and as otherwise permitted in accordance with Apps Foundry's Privacy Policy, available here: http://www.getscoop.com/privacy.\n" +
                "\n" +
                "You hereby agree to use SCOOP Premium only for lawfully acquired content.Any use for illegitimate content infringes the rights of others and may subject you to civil and criminal penalties,including possible monetary damages, for copyright infringement.\n" +
                "\n" +
                "SCOOP Premium is provided on an \"AS IS\" basis and may contain errors or inaccuracies that could cause failures, corruption or loss of data and/or information,including music, playlist, and play history, from your computer or device and from peripherals (including, without limitation, servers and other computers) connected thereto.You should back up all data and information on your computer or device and any peripherals prior to using SCOOP Premium.You expressly acknowledge and agree that all use of SCOOP Premium is at your sole risk.To the extent permitted by law, SCOOP shall have no liability with respect to your use of SCOOP Premium, including the inability to access matched or uploaded content.\n" +
                "\n" +
                "SCOOP reserves the right to change Content options that are accessible on SCOOP Premium without notice."));
        strings.add(new Content("PRIVACY\n" +
                "The Service is subject to Apps Foundry Privacy Policy at http://www.getscoop.com/privacy.\n" +
                "\n" +
                "When you use SCOOP, Apps Foundry will, from time to time, automatically collect information that can be used to identify contents in your SCOOP library on any device,such as your reading history, collections, and device history. This includes contents that were acquired through SCOOP and content that were obtained from other sources.This information will be stored anonymously and will not be associated with your name or Account.Apps Foundry will use this information and the contents of your SCOOP library, as well as other informations, to provide personalized recommendations to you.\n" +
                "\n" +
                "Apps Foundry may only use this information and combine it with aggregated information from the SCOOP libraries of other users, your Service purchase history data,aggregated purchase history data from other Service users, and other information obtained from third parties, to:\n" +
                "\n" +
                "Provide you recommendations regarding content and other products and services that you may wish to purchase or acquire.\n" +
                "Provide recommendations regarding products and services to other users.\n" +
                "At all times, your information will be treated in accordance with Apps Foundry's Privacy Policy.\n" +
                "\n" +
                "You consent to the use of your information as described above and as described in Apps Foundry Privacy Policy."));
        strings.add(new Content("CONTENT AVAILABILITY\n" +
                "SCOOP reserves the right to change content options (including eligibility for particular features) without notice.\n" +
                "\n" +
                "USE OF CONTENT\n" +
                "SCOOP is selling you a licence to use the Content. Once purchased from SCOOP, that licence forms a binding agreement directly between you andthe publisher of that Content (the \"Publisher\") who governs your use of that Product. You understand that the Service and certain Contentinclude a security framework using technology that protects digital information and limits your use of Contents to certain usage rules (\"Security Framework\")established by SCOOP and the Publishers and that, whether or not Products are limited by security technology, you shall use Productsin compliance with the applicable usage rules established by SCOOP and the Publishers (\"Usage Rules\"), and that any other use of the Products may constitute a copyright infringement.Any security technology is an inseparable part of the Content. SCOOP reserves the right to modify the Usage Rules for the Service at any time.\n" +
                "\n" +
                "You agree not to violate, circumvent, reverse-engineer, decompile, disassemble, or otherwise tamper with any element of the Security Framework - or to attempt or assist another person to do so.Usage Rules may be controlled and monitored by SCOOP for compliance purposes, and SCOOP reserves the right to enforce the Usage Rules without noticing you.\n" +
                "\n" +
                "You agree not to access the Service by any means other than through the use of software provided by Apps Foundry.You agree not to modify the software that is provided by Apps Foundry to access the Service in any manner or form, or to use modified versions of the softwarefor any purposes including obtaining unauthorised access to the Service.You shall not access or attempt to access an Account that you are not authorised to access.Violations of system or network security may result in civil or criminal liability."));
        strings.add(new Content("USAGE RULES\n" +
                "You shall be authorized to use Content only for personal, noncommercial use.\n" +
                "You shall be authorized to use Content on five SCOOP-authorized devices at any time, except for Organization's Digital Library (see below).\n" +
                "You shall be able to use Content on SCOOP software.\n" +
                "Some Contents may be downloaded only once and cannot be replaced if it is lost for any reason.It is your responsibility not to lose, destroy, or damage Contents once it is downloaded, and you may wish to back them up.\n" +
                "\n" +
                "The delivery of Contents does not transfer to you any commercial or promotional use rights of the Contents.Any burning or exporting capabilities are solely an accommodation to you and shall not constitute a grant, waiver,or other limitations of any rights of the copyright owners in any content embodied in any Content.\n" +
                "\n" +
                "You acknowledge that, because some aspects of the Service, Content, and administration of the Usage Rules entail the ongoing involvement of SCOOP,if SCOOP changes any part of or discontinues the Service, which SCOOP may do at its own consideration, you may not be able to use Content tothe same extent as prior to such change or discontinuation, and that SCOOP shall have no liability to you in such case.\n" +
                "\n" +
                "SUBMISSIONS TO THE SERVICE\n" +
                "The Service may offer interactive features that allow you to submit materials (including links to third-party content) on areas of the Service which are accessible and viewable by the public.You agree that any use of such features including any materials submitted by you, shall be your sole responsibility;shall not infringe or violate the rights of any other party or violate any laws, contribute to or encourage infringing or otherwise unlawful conduct,or in other words: obscene, objectionable, or explicit. You also agree that you have obtained all necessary rights and licenses.You agree to provide accurate and complete information in connection with your submission of any materials on the Service.You hereby grant SCOOP a worldwide, royalty-free, nonexclusive license to use such materials as part of the Service, or in relation to the Contents,without any compensation or obligation to you. SCOOP reserves the right to not post or publish any materials, andto remove or edit any material, at any time in its sole discretion without notice or liability.\n" +
                "\n" +
                "SCOOP has the right, but not the obligation, to monitor any materials submitted by you or is currently available on the Service, to investigate any reported orapparent violation of this Agreement, and to take any action that SCOOP in its sole discretion deems appropriate,including, without limitation, termination hereunder or under Apps Foundry's Copyright Policy."));
        strings.add(new Content("THIRD-PARTY MATERIALS\n" +
                "Certain Contents and services available via the Service may include materials from third parties. SCOOP may provide links to third-party websites as a convenience to you.You agree that SCOOP is not responsible for examining or evaluating the content accuracy, and SCOOP does not warrant and will not have any liability or responsibilityfor any third-party materials or websites, or for any other materials, products, or services of third parties.You agree that you will not use any third-party materials in a manner that would infringe or violate the rights of any other party and that SCOOP is not in any way responsible for any such use by you.\n" +
                "\n" +
                "OBJECTIONABLE MATERIAL\n" +
                "You understand that by using the Service, you may encounter materials that you may deem to be offensive, indecent, or objectionable, and such contents may or may not be identifiedas having explicit material. Nevertheless, you agree to use the Service at your sole risk and SCOOP shall have no liability to you for material that may be found to be offensive,indecent, or objectionable. Content types and descriptions are provided for convenience, and you agree that SCOOP does not guarantee their accuracy.\n" +
                "\n" +
                "IMPORTANT SAFETY INFORMATION\n" +
                "To avoid muscle, joint, or eye strain during your use of the products offered through the Service, you should always take frequent breaks, and take a longer rest if you experience soreness,fatigue, or discomfort. A very small percentage of people may experience seizures or blackouts when exposed to flashing lights or patterns, including but not limited to while playing video games or watching videos.Symptoms may include dizziness, nausea, involuntary movements, loss of awareness, altered vision, tingling, numbness, or other discomforts.Consult a doctor before using the products offered through the Service if you have ever suffered these or similar symptoms, and stop usingsuch products immediately and see a doctor if they occur during your use of such products. Parents should monitor their children's use of the products offered through the Service for signs of symptoms."));
        strings.add(new Content("INTELLECTUAL PROPERTY\n" +
                "You agree that the Service, including but not limited to Contents, graphics, user interface, audio clips, video clips, editorial content, and the scripts and software used to implement the Service,contains proprietary information and material that is owned by SCOOP and/or its licensors, and is protected by applicable intellectual property and other laws,including but not limited to copyright. You agree that you will not use such proprietary information or materials in any way whatsoever except for use of the Service in compliance with this Agreement.No portion of the Service may be reproduced in any form or by any means, except as expressly permitted in these terms.You agree not to modify, rent, lease, loan, sell, distribute, or create derivative works based on the Service in any manner,and you shall not exploit the Service in any unauthorized way whatsoever, including, but not limited to, by trespass or burdening network capacity.\n" +
                "\n" +
                "Notwithstanding any other provision of this Agreement, SCOOP and its licensors reserve the right to change, suspend, remove,or disable access to any Content, content, or other materials comprising a part of the Service at any time without notice.In no event will SCOOP be liable for making these changes.SCOOP may also impose limits on the use of or access to certain features or portions of the Service, in any case and without notice or liability.\n" +
                "\n" +
                "All copyrights in and to the Service (including the compilation of content, postings, links to other Internet resources, and descriptions of those resources)and related software are owned by SCOOP and/or its licensors, who reserve all their rights in law and equity.THE USE OF THE SOFTWARE OR ANY PART OF THE SERVICE, EXCEPT FOR USE OF THE SERVICE AS PERMITTED IN THIS AGREEMENT,IS STRICTLY PROHIBITED AND INFRINGES ON THE INTELLECTUAL PROPERTY RIGHTS OF OTHERS AND MAY SUBJECT YOU TO CIVIL AND CRIMINAL PENALTIES, INCLUDING POSSIBLE MONETARY DAMAGES, FOR COPYRIGHT INFRINGEMENT.\n" +
                "\n" +
                "Apps Foundry, the Apps Foundry logo, SCOOP, and other Apps Foundry trademarks, service marks, graphics, and logos used in connection with the Service aretrademarks or registered trademarks of SCOOP and/or PT APLIKASI PRIMA PERSADA in Indonesia and/or other countries.Other trademarks, service marks, graphics, and logos used in connection with the Service may be the trademarks of their respective owners.You are granted no right or license with respect to any of the aforesaid trademarks and any use of such trademarks."));
        strings.add(new Content("TERMINATION\n" +
                "If you fail, or SCOOP suspects that you have failed, to comply with any of the provisions of this Agreement, SCOOP, at its sole discretion, without notice to you may:(i) terminate this Agreement and/or your Account, and you will remain liable for all amounts due under your Account up to and including the date of termination; and/or(ii) cause the license to the software to be terminated.\n" +
                "\n" +
                "SCOOP reserves the right to modify, suspend, or discontinue the Service (or any part or content thereof) at any time with or without notice to you,and SCOOP will not be liable to you or to any third party should it exercise such rights.\n" +
                "\n" +
                "DISCLAIMER OF WARRANTIES; LIABILITY LIMITATION\n" +
                "SCOOP DOES NOT GUARANTEE, REPRESENT, OR WARRANT THAT YOUR USE OF THE SERVICE WILL BE UNINTERRUPTED OR ERROR-FREE,AND YOU AGREE THAT FROM TIME TO TIME SCOOP MAY REMOVE THE SERVICE FOR INDEFINITE PERIODS OF TIME, OR CANCEL THE SERVICE AT ANY TIME, WITHOUT NOTICE TO YOU.\n" +
                "\n" +
                "YOU EXPRESSLY AGREE THAT YOUR USE OF, OR INABILITY TO USE, THE SERVICE IS AT YOUR SOLE RISK. THE SERVICE AND ALL PRODUCTS AND SERVICES DELIVERED TO YOU THROUGH THE SERVICEARE (EXCEPT AS EXPRESSLY STATED BY SCOOP) PROVIDED \"AS IS\" AND \"AS AVAILABLE\" FOR YOUR USE, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED,INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE, AND NONINFRINGEMENT.BECAUSE SOME JURISDICTIONS DO NOT ALLOW THE EXCLUSION OF IMPLIED WARRANTIES, THE ABOVE EXCLUSION OF IMPLIED WARRANTIES MAY NOT APPLY TO YOU."));
        strings.add(new Content("IN NO CASE SHALL SCOOP, ITS DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATES, AGENTS, CONTRACTORS, OR LICENSORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, PUNITIVE, SPECIAL, ORCONSEQUENTIAL DAMAGES ARISING FROM YOUR USE OF ANY OF THE SERVICE OR FOR ANY OTHER CLAIM RELATED IN ANY WAY TO YOUR USE OF THE SERVICE, INCLUDING, BUT NOT LIMITED TO,ANY ERRORS OR OMISSIONS IN ANY CONTENT, OR ANY LOSS OR DAMAGE OF ANY KIND INCURRED AS A RESULT OF THE USE OF ANY CONTENT (OR PRODUCT) POSTED, TRANSMITTED,OR OTHERWISE MADE AVAILABLE VIA THE SERVICE, EVEN IF ADVISED OF THEIR POSSIBILITY. BECAUSE SOME STATES OR JURISDICTIONS DO NOT ALLOW THE EXCLUSIONOR THE LIMITATION OF LIABILITY FOR CONSEQUENTIAL OR INCIDENTAL DAMAGES, IN SUCH STATES OR JURISDICTIONS, SCOOP'S LIABILITY SHALL BE LIMITED TO THE EXTENT PERMITTED BY LAW.\n" +
                "\n" +
                "SCOOP SHALL USE REASONABLE EFFORTS TO PROTECT INFORMATION SUBMITTED BY YOU IN CONNECTION WITH THE SERVICE, BUT YOU AGREE THAT YOUR SUBMISSION OF SUCH INFORMATION IS AT YOUR SOLE RISK,AND SCOOP HEREBY DISCLAIMS ANY AND ALL LIABILITY TO YOU FOR ANY LOSS OR LIABILITY RELATING TO SUCH INFORMATION IN ANY WAY.\n" +
                "\n" +
                "SCOOP DOES NOT REPRESENT OR GUARANTEE THAT THE SERVICE WILL BE FREE FROM LOSS, CORRUPTION, ATTACK, VIRUSES, INTERFERENCE, HACKING, OR OTHER SECURITY INTRUSION,AND SCOOP DISCLAIMS ANY LIABILITY RELATING THERETO. SOME CONTENTS CAN BE DOWNLOADED ONLY ONCE; AFTER BEING DOWNLOADED, THEY CANNOT BE REPLACED IF LOST FOR ANY REASON.YOU SHALL BE RESPONSIBLE FOR BACKING UP YOUR OWN SYSTEM, INCLUDING ANY SCOOP PRODUCTS PURCHASED OR RENTED FROM THE SERVICE."));
        strings.add(new Content("WAIVER AND INDEMNITY\n" +
                "BY USING THE SERVICE, YOU AGREE, TO THE EXTENT PERMITTED BY LAW, TO INDEMNIFY AND HOLD SCOOP, ITS DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATES, AGENTS, CONTRACTORS, AND LICENSORS HARMLESSWITH RESPECT TO ANY CLAIMS ARISING OUT OF YOUR BREACH OF THIS AGREEMENT, YOUR USE OF THE SERVICE, OR ANY ACTION TAKEN BY SCOOP AS PART OF ITS INVESTIGATION OFA SUSPECTED VIOLATION OF THIS AGREEMENT OR AS A RESULT OF ITS FINDING OR DECISION THAT A VIOLATION OF THIS AGREEMENT HAS OCCURRED.THIS MEANS THAT YOU CANNOT SUE OR RECOVER ANY DAMAGES FROM SCOOP, ITS DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATES, AGENTS, CONTRACTORS, ANDLICENSORS AS A RESULT OF ITS DECISION TO REMOVE OR REFUSE TO PROCESS ANY INFORMATION OR CONTENT, TO WARN YOU, TO SUSPEND OR TERMINATE YOUR ACCESS TO THE SERVICE,OR TO TAKE ANY OTHER ACTION DURING THE INVESTIGATION OF A SUSPECTED VIOLATION OR AS A RESULT OF SCOOP'S CONCLUSION THAT A VIOLATION OF THIS AGREEMENT HAS OCCURRED.THIS WAIVER AND INDEMNITY PROVISION APPLIES TO ALL VIOLATIONS DESCRIBED IN OR CONTEMPLATED BY THIS AGREEMENT.\n" +
                "\n" +
                "CHANGES\n" +
                "SCOOP reserves the right at any time to modify this Agreement and to impose new or additional terms or conditions on your use of the Service.Such modifications and additional terms and conditions will be effective immediately and incorporated into this Agreement.Your continued use of the Service will be deemed acceptance thereof.\n" +
                "\n" +
                "MISCELLANEOUS\n" +
                "This Agreement constitutes the entire agreement between you and SCOOP and governs your use of the Service, superseding any prior agreements between you and SCOOP.You also may be subject to additional terms and conditions that may apply when you use affiliate services, third-party content, or third-party software.If any part of this Agreement is held invalid or unenforceable, that portion shall be construed in a manner consistent with applicable law to reflect, as nearly as possible,the original intentions of the parties, and the remaining portions shall remain in full force and effect.SCOOP's failure to enforce any right or provisions in this Agreement will not constitute a waiver of such or any other provision.SCOOP will not be responsible for failures to fulfill any obligations due to causes beyond its control.\n" +
                "\n" +
                "The Service is operated by SCOOP from its offices in Indonesia. You agree to comply with all local, state, and national laws, statutes, ordinances, and regulations that apply to your use of the Service.All transactions on the Service are governed by Indonesia law, without giving effect to its conflict of law provisions. Your use of the Service may also be subject to other laws.You expressly agree that exclusive jurisdiction for any claim or dispute with SCOOP or relating in any way to your use of the Service resides in the courts inKepaniteraan Pengadilan Negeri Jakarta Selatan Office in Jakarta."));
        strings.add(new Content("SCOOP may notify you with respect to the Service by sending an email message to your Account email address or a letter via postal mail to your Account mailing address,or by a posting on the Service. Notices shall become effective immediately.\n" +
                "\n" +
                "SCOOP reserves the right to take steps SCOOP believes are reasonably necessary or appropriate to enforce and/or verify compliance with any part of this Agreement.You agree that SCOOP has the right, without liability to you, to disclose any Registration Data and/or Account information to law enforcement authorities, government officials,and/or a third party, as SCOOP believes is reasonably necessary or appropriate to enforce and/or verify compliance with any part of this Agreement(including but not limited to SCOOP's right to cooperate with any legal process relating to your use of the Service and/or SCOOP Products,and/or a third-party claim that your use of the Service and/or Contents is unlawful and/or infringes such third party's rights)."));

        return Observable.just(strings);
    }
}
